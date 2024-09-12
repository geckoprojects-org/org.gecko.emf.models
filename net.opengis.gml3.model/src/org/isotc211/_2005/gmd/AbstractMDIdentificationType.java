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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract MD Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic information about data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getCredit <em>Credit</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getPointOfContact <em>Point Of Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getResourceMaintenance <em>Resource Maintenance</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getGraphicOverview <em>Graphic Overview</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getResourceFormat <em>Resource Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getDescriptiveKeywords <em>Descriptive Keywords</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getResourceSpecificUsage <em>Resource Specific Usage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getResourceConstraints <em>Resource Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getAggregationInfo <em>Aggregation Info</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractMD_Identification_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractMDIdentificationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(CICitationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_Citation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getCitation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_Abstract()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getAbstract();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getPurpose();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractMDIdentificationType#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_Credit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='credit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getCredit();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDProgressCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDProgressCodePropertyType> getStatus();

	/**
	 * Returns the value of the '<em><b>Point Of Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Contact</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_PointOfContact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointOfContact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getPointOfContact();

	/**
	 * Returns the value of the '<em><b>Resource Maintenance</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDMaintenanceInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Maintenance</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_ResourceMaintenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceMaintenance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDMaintenanceInformationPropertyType> getResourceMaintenance();

	/**
	 * Returns the value of the '<em><b>Graphic Overview</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDBrowseGraphicPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Overview</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_GraphicOverview()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphicOverview' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDBrowseGraphicPropertyType> getGraphicOverview();

	/**
	 * Returns the value of the '<em><b>Resource Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDFormatPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Format</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_ResourceFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDFormatPropertyType> getResourceFormat();

	/**
	 * Returns the value of the '<em><b>Descriptive Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDKeywordsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptive Keywords</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_DescriptiveKeywords()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptiveKeywords' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDKeywordsPropertyType> getDescriptiveKeywords();

	/**
	 * Returns the value of the '<em><b>Resource Specific Usage</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDUsagePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Specific Usage</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_ResourceSpecificUsage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceSpecificUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDUsagePropertyType> getResourceSpecificUsage();

	/**
	 * Returns the value of the '<em><b>Resource Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDConstraintsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Constraints</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_ResourceConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDConstraintsPropertyType> getResourceConstraints();

	/**
	 * Returns the value of the '<em><b>Aggregation Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDAggregateInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractMDIdentificationType_AggregationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aggregationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDAggregateInformationPropertyType> getAggregationInfo();

} // AbstractMDIdentificationType
