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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callstack Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CallstackType#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CallstackType#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCallstackType()
 * @model extendedMetaData="name='callstack_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CallstackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(FramesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCallstackType_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	FramesType getFrames();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CallstackType#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(FramesType value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The object in the BOM identified by its bom-ref. This is often a component or service,
	 *                                     but may be any object type supporting bom-refs. Tools used for analysis should already
	 *                                     be defined in the BOM, either in the metadata/tools, components, or formulation.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference.
	 * @see #setTools(ToolsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCallstackType_Tools()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tools' namespace='##targetNamespace'"
	 * @generated
	 */
	ToolsType getTools();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CallstackType#getTools <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools</em>' containment reference.
	 * @see #getTools()
	 * @generated
	 */
	void setTools(ToolsType value);

} // CallstackType
