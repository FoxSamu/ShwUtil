/*
 * Copyright (c) 2021 Shadew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shadew.util.codegen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Generates the massive amount of function combinations
 */
public final class FunctionGenerator {
    private FunctionGenerator() {
    }

    public static void main(String[] args) throws IOException {
        String pkg = "net.shadew.util.function";
        File outDir = new File("generated");

        for (Type type : Type.values()) {
            String rpkg = pkg + ".r" + type.name.toLowerCase();
            generateSupplier(type, rpkg, outDir);

            for (Type in1 : Type.values()) {
                if (in1 == Type.VOID) continue;
                generateFunc(in1, type, rpkg, outDir);

                for (Type in2 : Type.values()) {
                    if (in2 == Type.VOID) continue;
                    generateFunc2(in1, in2, type, rpkg, outDir);

                    for (Type in3 : Type.values()) {
                        if (in3 == Type.VOID) continue;
                        generateFunc3(in1, in2, in3, type, rpkg, outDir);
                    }
                }
            }
        }
    }

    private static void generateSupplier(Type ret, String pkg, File outDir) throws IOException {
        FunctionBuilder builder = new FunctionBuilder();

        String folderN = pkg.replace('.', File.separatorChar);
        File folder = new File(outDir, folderN);
        folder.mkdirs();

        builder.ret = ret;
        builder.packageName = pkg;
        File file = new File(folder, builder.computeName() + ".java");
        System.out.println(builder.computeName());
        try (FileOutputStream out = new FileOutputStream(file)) {
            builder.writeCode(new PrintStream(out));
        }
    }

    private static void generateFunc(Type in, Type ret, String pkg, File outDir) throws IOException {
        FunctionBuilder builder = new FunctionBuilder();

        String folderN = pkg.replace('.', File.separatorChar);
        File folder = new File(outDir, folderN);
        folder.mkdirs();

        builder.ret = ret;
        builder.packageName = pkg;
        builder.args.add(in);
        File file = new File(folder, builder.computeName() + ".java");
        try (FileOutputStream out = new FileOutputStream(file)) {
            builder.writeCode(new PrintStream(out));
        }
    }

    private static void generateFunc2(Type in1, Type in2, Type ret, String pkg, File outDir) throws IOException {
        FunctionBuilder builder = new FunctionBuilder();

        String folderN = pkg.replace('.', File.separatorChar);
        File folder = new File(outDir, folderN);
        folder.mkdirs();

        builder.ret = ret;
        builder.packageName = pkg;
        builder.args.add(in1);
        builder.args.add(in2);
        File file = new File(folder, builder.computeName() + ".java");
        try (FileOutputStream out = new FileOutputStream(file)) {
            builder.writeCode(new PrintStream(out));
        }
    }

    private static void generateFunc3(Type in1, Type in2, Type in3, Type ret, String pkg, File outDir) throws IOException {
        FunctionBuilder builder = new FunctionBuilder();

        String folderN = pkg.replace('.', File.separatorChar);
        File folder = new File(outDir, folderN);
        folder.mkdirs();

        builder.ret = ret;
        builder.packageName = pkg;
        builder.args.add(in1);
        builder.args.add(in2);
        builder.args.add(in3);
        File file = new File(folder, builder.computeName() + ".java");
        try (FileOutputStream out = new FileOutputStream(file)) {
            builder.writeCode(new PrintStream(out));
        }
    }

    private static class FunctionBuilder {
        String packageName;
        final List<Type> args = new ArrayList<>();
        final List<String> typeArgs = new ArrayList<>();
        final List<String> descriptor = new ArrayList<>();
        Type ret = Type.VOID;
        String retType;

        String computeName() {
            StringBuilder builder = new StringBuilder();
            if (args.isEmpty())
                builder.append("Void");
            else for (Type type : args)
                builder.append(type.name);

            builder.append("2");
            builder.append(ret.name);
            builder.append("Fn");

            return builder.toString();
        }

        void computeArgs() {
            typeArgs.clear();
            descriptor.clear();

            int argI = 1;
            for (Type type : args) {
                if (type == Type.REF) {
                    descriptor.add("P" + argI + " p" + argI);
                    typeArgs.add("P" + argI);
                } else {
                    descriptor.add(type.type + " p" + argI);
                }
                argI++;
            }

            if (ret == Type.REF) {
                typeArgs.add("R");
                retType = "R";
            } else {
                retType = ret.type;
            }
        }

        String computeJavadoc() {
            StringBuilder javadoc = new StringBuilder();

            javadoc.append(String.format("/**%n"));
            javadoc.append(" * A function that takes ");

            int l = args.size() - 1, i = 0;
            if (l != 0) {
                for (Type type : args) {
                    if (i == 0) {
                        javadoc.append(type.parJavadoc);
                    } else if (i != l) {
                        javadoc.append(", ").append(type.parJavadoc);
                    } else {
                        javadoc.append(" and ").append(type.parJavadoc);
                    }
                    i++;
                }
            } else {
                javadoc.append("no arguments");
            }

            javadoc.append(" and returns ");
            javadoc.append(ret.retJavadoc);
            javadoc.append(".");

            javadoc.append(String.format("%n"));
            javadoc.append(" */");
            javadoc.append(String.format("%n"));

            return javadoc.toString();
        }

        String computeTypeArgs() {
            if (typeArgs.isEmpty()) {
                return "";
            } else {
                return typeArgs.stream().collect(Collectors.joining(", ", "<", ">"));
            }
        }

        String computeInterface() {
            return "public interface " + computeName() + computeTypeArgs();
        }

        String computeSignature() {
            return String.format("%s invoke(%s);", retType, String.join(", ", descriptor));
        }

        void writeCode(PrintStream stream) {
            computeArgs();
            stream.printf("package %s;%n", packageName);
            stream.printf("%n");
            stream.printf("%s", computeJavadoc());
            stream.printf("%s {%n", computeInterface());
            stream.printf("    %s%n", computeSignature());
            stream.printf("}%n");
        }
    }

    private static enum Type {
        VOID("Void", "void", "a {@code void}", "nothing"),
        BOOL("Bool", "boolean", "a {@code boolean}", "a {@code boolean}"),
        BYTE("Byte", "byte", "a {@code byte}", "a {@code byte}"),
        SHORT("Short", "short", "a {@code short}", "a {@code short}"),
        INT("Int", "int", "an {@code int}", "an {@code int}"),
        LONG("Long", "long", "a {@code long}", "a {@code long}"),
        FLOAT("Float", "float", "a {@code float}", "a {@code float}"),
        DOUBLE("Double", "double", "a {@code double}", "a {@code double}"),
        CHAR("Char", "char", "a {@code char}", "a {@code char}"),
        REF("Ref", "java.lang.Object", "an object", "an object");

        private final String name;
        private final String type;
        private final String parJavadoc;
        private final String retJavadoc;

        Type(String name, String type, String javadoc, String retJavadoc) {
            this.name = name;
            this.type = type;
            this.parJavadoc = javadoc;
            this.retJavadoc = retJavadoc;
        }
    }
}
