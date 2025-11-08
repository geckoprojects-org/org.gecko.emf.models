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
 * A representation of the model object '<em><b>Component Evidence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCallstack <em>Callstack</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType()
 * @model extendedMetaData="name='componentEvidenceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComponentEvidenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.IdentityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence that substantiates the identity of a component. The identify may be an
	 *                         object or an array of identity objects. Support for specifying identity as a single object was
	 *                         introduced in CycloneDX v1.5. "unbounded" was introduced in v1.6. It is recommended that all
	 *                         implementations are aware of "unbounded".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Identity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentityType> getIdentity();

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence of individual instances of a component spread across multiple locations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference.
	 * @see #setOccurrences(OccurrencesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Occurrences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrences' namespace='##targetNamespace'"
	 * @generated
	 */
	OccurrencesType getOccurrences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getOccurrences <em>Occurrences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' containment reference.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(OccurrencesType value);

	/**
	 * Returns the value of the '<em><b>Callstack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence of the components use through the callstack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Callstack</em>' containment reference.
	 * @see #setCallstack(CallstackType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Callstack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='callstack' namespace='##targetNamespace'"
	 * @generated
	 */
	CallstackType getCallstack();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCallstack <em>Callstack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callstack</em>' containment reference.
	 * @see #getCallstack()
	 * @generated
	 */
	void setCallstack(CallstackType value);

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference.
	 * @see #setLicenses(LicenseChoiceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Licenses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenses' namespace='##targetNamespace'"
	 * @generated
	 */
	LicenseChoiceType getLicenses();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getLicenses <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licenses</em>' containment reference.
	 * @see #getLicenses()
	 * @generated
	 */
	void setLicenses(LicenseChoiceType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         opyright evidence captures intellectual property assertions, providing evidence of possible ownership and legal protection.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightsType getCopyright();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ComponentEvidenceType#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(CopyrightsType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                     do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getComponentEvidenceType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ComponentEvidenceType
