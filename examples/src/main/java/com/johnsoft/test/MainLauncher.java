/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package com.johnsoft.test;

import java.io.File;
import java.io.IOException;

/**
 * @author John Kenrinus Lee
 * @version 2016-06-25
 */
public class MainLauncher {
    public static void main(String[] args) throws IOException {
        int apiLevel = 14;
        File dexFile = new File("/Users/baidu/temp/AopTest/app/build/outputs/apk/app-debug/classes.dex");


//        Dex dex = new Dex(dexFile);
//        for (ClassDef classDef : dex.classDefs()) {
//            if (classDef.getClassDataOffset() > 0) {
//                ClassData classData = dex.readClassData(classDef);
//                ClassData.Method[] methods = classData.allMethods();
//                for (ClassData.Method method : methods) {
//                    if (method.getCodeOffset() > 0) {
//                        Code code = dex.readCode(method);
//                        short[] instructions = code.getInstructions();
//                        if (instructions != null) {
//                            System.out.println(instructions.length);
//                        }
//                    }
//                }
//            }
//        }
//        for (String typeName : dex.typeNames()) {
//            if (typeName.contains("Activity")) {
//                System.out.println(typeName);
//            }
//        }


//        DexFileReader reader = new DexFileReader(dexFile);
//        DexFileNode dexFileNode = new DexFileNode();
//        reader.accept(dexFileNode);
//        for (DexClassNode dexClassNode : dexFileNode.clzs) {
//            if (dexClassNode.className.contains("MainActivity")) {
//                System.out.println("class: " + dexClassNode.className);
//                System.out.println("source: " + dexClassNode.source);
//                System.out.println("super class: " + dexClassNode.superClass);
//                System.out.println("interface list: " + Arrays.toString(dexClassNode.interfaceNames));
//                for (DexMethodNode dexMethodNode : dexClassNode.methods) {
//                    if ((dexMethodNode.access & ~DexConstants.ACC_PUBLIC) != 0) {
//                        System.out.print("public ");
//                    }
//                    if ((dexMethodNode.access & ~DexConstants.ACC_STATIC) != 0) {
//                        System.out.print("static ");
//                    }
//                    System.out.print(dexMethodNode.method.getReturnType() + " ");
//                    System.out.print(dexMethodNode.method.getName() + " (");
//                    System.out.print(Arrays.toString(dexMethodNode.method.getParameterTypes()) + ") ");
//                    System.out.println();
//                    int i = 0;
//                    for (DexStmtNode dexStmtNode : dexMethodNode.codeNode.stmts) {
//                        if (dexStmtNode.op != null) {
//                            if (i < 10) {
//                                System.out.println(dexStmtNode.op.displayName);
//                                ++i;
//                            } else {
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }


//        DexBackedDexFile dexBackedDexFile = DexFileFactory.loadDexFile(dexFile, apiLevel, false);
//        for (ClassDef classDef: dexBackedDexFile.getClasses()) {
//            if (classDef.getType().contains("MainActivity")) {
//                System.out.println(">>> class: " + classDef.getType());
//                System.out.println(">>> source: " + classDef.getSourceFile());
//                System.out.println(">>> super class: " + classDef.getSuperclass());
//                System.out.println(">>> interface list: " + String.valueOf(classDef.getInterfaces()));
//                for (Method method : classDef.getMethods()) {
//                    System.out.print(">>> ");
//                    if ((method.getAccessFlags() & ~DexConstants.ACC_PUBLIC) != 0) {
//                        System.out.print("public ");
//                    }
//                    if ((method.getAccessFlags() & ~DexConstants.ACC_STATIC) != 0) {
//                        System.out.print("static ");
//                    }
//                    System.out.print(method.getReturnType() + " ");
//                    System.out.print(method.getName() + " (");
//                    for (MethodParameter parameter : method.getParameters()) {
//                        System.out.print(parameter.getType() + " " + parameter.getName() + ", ");
//                    }
//                    System.out.println(") ");
//                    int i = 0;
//                    for (Instruction instruction: method.getImplementation().getInstructions()) {
//                        if (instruction.getOpcode() != null) {
//                            if (i < 10) {
//                                System.out.println(">>> " + instruction.getOpcode().name);
//                                ++i;
//                            } else {
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }


//        ApplicationReader applicationReader = new ApplicationReader(apiLevel, dexFile);
//        ApplicationNode applicationNode = new ApplicationNode(apiLevel);
//        applicationReader.accept(applicationNode, 0);
//        for (ClassNode classNode : applicationNode.classes) {
//            if (classNode.name.contains("MainActivity")) {
//                System.out.println("$ class: " + classNode.name);
//                System.out.println("$ source: " + classNode.sourceFile);
//                System.out.println("$ super class: " + classNode.superName);
//                System.out.println("$ interface list: " + String.valueOf(classNode.interfaces));
//                for (MethodNode methodNode : classNode.methods) {
//                    System.out.print("$ ");
//                    if ((methodNode.access & ~Opcodes.ACC_PUBLIC) != 0) {
//                        System.out.print("public ");
//                    }
//                    if ((methodNode.access & ~Opcodes.ACC_STATIC) != 0) {
//                        System.out.print("static ");
//                    }
//                    System.out.print("[signature: " + Arrays.toString(methodNode.signature) + "] ");
//                    System.out.print("[description: " + methodNode.desc + "] ");
//                    System.out.print(methodNode.name + " (");
//                    System.out.print(Arrays.toString(methodNode.parameters) + ") ");
//                    System.out.println();
//                    InsnList instructions = methodNode.instructions;
//                    for (int i = 0; i < instructions.size(); ++i) {
//                        AbstractInsnNode insnNode = instructions.get(i);
//                        for (Op op : Op.values()) {
//                            if (op.opcode == insnNode.getOpcode()) {
//                                System.out.println("$ " + op.displayName);
//                                break;
//                            }
//                        }
//                        if (i > 10) {
//                            break;
//                        }
//                    }
//                }
//            }
//        }


    }
}
