/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.classfile.constant.visitor;

import proguard.classfile.*;
import proguard.classfile.constant.Constant;
import proguard.classfile.util.SimplifiedVisitor;
import proguard.util.Counter;

/**
 * This ConstantVisitor counts the number of constants that have been visited.
 *
 * @author Eric Lafortune
 */
public class ConstantCounter
extends      SimplifiedVisitor
implements   ConstantVisitor,
             Counter
{
    private int count;


    // Implementations for Counter.

    /**
     * Returns the number of class members that has been visited so far.
     */
    public int getCount()
    {
        return count;
    }


    // Implementations for ConstantVisitor.

    public void visitAnyConstant(Clazz clazz, Constant constant)
    {
        count++;
    }
}
