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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affirmation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AffirmationType#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AffirmationType#getSignatories <em>Signatories</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AffirmationType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAffirmationType()
 * @model extendedMetaData="name='affirmation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AffirmationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The brief statement affirmed by an individual regarding all declarations.
	 *                                     This could be an affirmation of acceptance by a third-party auditor or receiving
	 *                                     individual of a file. For example: "I certify, to the best of my knowledge, that all information is correct."
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAffirmationType_Statement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AffirmationType#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Signatories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The list of signatories authorized on behalf of an organization to assert validity of this document.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatories</em>' containment reference.
	 * @see #setSignatories(SignatoriesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAffirmationType_Signatories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signatories' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatoriesType getSignatories();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AffirmationType#getSignatories <em>Signatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatories</em>' containment reference.
	 * @see #getSignatories()
	 * @generated
	 */
	void setSignatories(SignatoriesType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAffirmationType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AffirmationType
