/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:ShellPropertyType encapsulates a shell to represent a component of a solid boundary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ShellPropertyType#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getShellPropertyType()
 * @model extendedMetaData="name='ShellPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShellPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shell is used to represent a single connected component of a solid boundary as specified in ISO 19107:2003, 6.3.8.
	 * Every gml:surfaceMember references or contains one surface, i.e. any element which is substitutable for gml:AbstractSurface. In the context of a shell, the surfaces describe the boundary of the solid. 
	 * If provided, the aggregationType attribute shall have the value "set".
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(ShellType)
	 * @see net.opengis.gml.gml.GMLPackage#getShellPropertyType_Shell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Shell' namespace='##targetNamespace'"
	 * @generated
	 */
	ShellType getShell();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ShellPropertyType#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(ShellType value);

} // ShellPropertyType
