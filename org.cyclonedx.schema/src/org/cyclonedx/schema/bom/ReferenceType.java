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
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ReferenceType#getId <em>Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ReferenceType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getReferenceType()
 * @model extendedMetaData="name='reference_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that uniquely identifies the vulnerability. For example:
	 *                                                 CVE-2021-39182, GHSA-35m5-8cvj-8783, and SNYK-PYTHON-ENROCRYPT-1912876.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReferenceType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ReferenceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source that published the vulnerability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(VulnerabilitySourceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getReferenceType_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	VulnerabilitySourceType getSource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ReferenceType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VulnerabilitySourceType value);

} // ReferenceType
