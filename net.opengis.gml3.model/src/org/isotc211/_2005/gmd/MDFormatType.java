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
 * A representation of the model object '<em><b>MD Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of the form of the data to be distributed
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getAmendmentNumber <em>Amendment Number</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getFileDecompressionTechnique <em>File Decompression Technique</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFormatType#getFormatDistributor <em>Format Distributor</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType()
 * @model extendedMetaData="name='MD_Format_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDFormatType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFormatType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getVersion();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFormatType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Amendment Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amendment Number</em>' containment reference.
	 * @see #setAmendmentNumber(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_AmendmentNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amendmentNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getAmendmentNumber();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFormatType#getAmendmentNumber <em>Amendment Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amendment Number</em>' containment reference.
	 * @see #getAmendmentNumber()
	 * @generated
	 */
	void setAmendmentNumber(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSpecification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFormatType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>File Decompression Technique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Decompression Technique</em>' containment reference.
	 * @see #setFileDecompressionTechnique(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_FileDecompressionTechnique()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileDecompressionTechnique' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFileDecompressionTechnique();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFormatType#getFileDecompressionTechnique <em>File Decompression Technique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Decompression Technique</em>' containment reference.
	 * @see #getFileDecompressionTechnique()
	 * @generated
	 */
	void setFileDecompressionTechnique(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Format Distributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDDistributorPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Distributor</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFormatType_FormatDistributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formatDistributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDDistributorPropertyType> getFormatDistributor();

} // MDFormatType
