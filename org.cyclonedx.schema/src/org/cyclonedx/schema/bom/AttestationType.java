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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attestation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AttestationType#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AttestationType#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AttestationType#getMap <em>Map</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AttestationType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAttestationType()
 * @model extendedMetaData="name='attestation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AttestationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The short description explaining the main points of the attestation.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttestationType_Summary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AttestationType#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Assessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The `bom-ref` to the assessor asserting the attestation.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessor</em>' attribute.
	 * @see #setAssessor(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttestationType_Assessor()
	 * @model dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='assessor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssessor();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AttestationType#getAssessor <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessor</em>' attribute.
	 * @see #getAssessor()
	 * @generated
	 */
	void setAssessor(String value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.MapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The grouping of requirements to claims and the attestors declared conformance and confidence thereof.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttestationType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAttestationType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AttestationType
