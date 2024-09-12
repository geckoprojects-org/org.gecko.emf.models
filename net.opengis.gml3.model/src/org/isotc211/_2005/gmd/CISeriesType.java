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

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Series Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CISeriesType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CISeriesType#getIssueIdentification <em>Issue Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CISeriesType#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCISeriesType()
 * @model extendedMetaData="name='CI_Series_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CISeriesType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCISeriesType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CISeriesType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Issue Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Identification</em>' containment reference.
	 * @see #setIssueIdentification(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCISeriesType_IssueIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issueIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getIssueIdentification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CISeriesType#getIssueIdentification <em>Issue Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Identification</em>' containment reference.
	 * @see #getIssueIdentification()
	 * @generated
	 */
	void setIssueIdentification(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCISeriesType_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getPage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CISeriesType#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(CharacterStringPropertyType value);

} // CISeriesType
