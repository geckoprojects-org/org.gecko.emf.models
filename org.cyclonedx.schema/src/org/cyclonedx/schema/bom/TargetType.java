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
 * A representation of the model object '<em><b>Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.TargetType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.TargetType#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetType()
 * @model extendedMetaData="name='target_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a component or service by the objects bom-ref.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetType_Ref()
	 * @model dataType="org.cyclonedx.schema.bom.RefType"
	 *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TargetType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zero or more individual versions or range of versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference.
	 * @see #setVersions(VersionsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTargetType_Versions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versions' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionsType getVersions();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TargetType#getVersions <em>Versions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versions</em>' containment reference.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(VersionsType value);

} // TargetType
