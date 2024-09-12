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
import org.isotc211._2005.gco.DatePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Citation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Standardized resource reference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getAlternateTitle <em>Alternate Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getEditionDate <em>Edition Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getCitedResponsibleParty <em>Cited Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getPresentationForm <em>Presentation Form</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getSeries <em>Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getOtherCitationDetails <em>Other Citation Details</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getCollectiveTitle <em>Collective Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getISBN <em>ISBN</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CICitationType#getISSN <em>ISSN</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType()
 * @model extendedMetaData="name='CI_Citation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CICitationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getTitle();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Alternate Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Title</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_AlternateTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getAlternateTitle();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIDatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIDatePropertyType> getDate();

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' containment reference.
	 * @see #setEdition(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_Edition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getEdition();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getEdition <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' containment reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Edition Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Date</em>' containment reference.
	 * @see #setEditionDate(DatePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_EditionDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='editionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DatePropertyType getEditionDate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getEditionDate <em>Edition Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Date</em>' containment reference.
	 * @see #getEditionDate()
	 * @generated
	 */
	void setEditionDate(DatePropertyType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDIdentifierPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDIdentifierPropertyType> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Cited Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Responsible Party</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_CitedResponsibleParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citedResponsibleParty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getCitedResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Presentation Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Form</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_PresentationForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentationForm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIPresentationFormCodePropertyType> getPresentationForm();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(CISeriesPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	CISeriesPropertyType getSeries();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(CISeriesPropertyType value);

	/**
	 * Returns the value of the '<em><b>Other Citation Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Citation Details</em>' containment reference.
	 * @see #setOtherCitationDetails(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_OtherCitationDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherCitationDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getOtherCitationDetails();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getOtherCitationDetails <em>Other Citation Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Citation Details</em>' containment reference.
	 * @see #getOtherCitationDetails()
	 * @generated
	 */
	void setOtherCitationDetails(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Collective Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collective Title</em>' containment reference.
	 * @see #setCollectiveTitle(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_CollectiveTitle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collectiveTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCollectiveTitle();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getCollectiveTitle <em>Collective Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collective Title</em>' containment reference.
	 * @see #getCollectiveTitle()
	 * @generated
	 */
	void setCollectiveTitle(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>ISBN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISBN</em>' containment reference.
	 * @see #setISBN(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_ISBN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISBN' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getISBN();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getISBN <em>ISBN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISBN</em>' containment reference.
	 * @see #getISBN()
	 * @generated
	 */
	void setISBN(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>ISSN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISSN</em>' containment reference.
	 * @see #setISSN(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCICitationType_ISSN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISSN' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getISSN();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CICitationType#getISSN <em>ISSN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISSN</em>' containment reference.
	 * @see #getISSN()
	 * @generated
	 */
	void setISSN(CharacterStringPropertyType value);

} // CICitationType
