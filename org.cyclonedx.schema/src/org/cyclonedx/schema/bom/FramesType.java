/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.cyclonedx.schema.bom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frames Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.FramesType#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getFramesType()
 * @model extendedMetaData="name='frames_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FramesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.FrameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Within a call stack, a frame is a discrete unit that encapsulates an execution context, including local variables, parameters, and the return address. As function calls are made, frames are pushed onto the stack, forming an array-like structure that orchestrates the flow of program execution and manages the sequence of function invocations.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getFramesType_Frame()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrameType> getFrame();

} // FramesType
