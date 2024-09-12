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
import org.isotc211._2005.gco.BinaryPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Application Schema Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the application schema used to build the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSchemaLanguage <em>Schema Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getConstraintLanguage <em>Constraint Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSchemaAscii <em>Schema Ascii</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getGraphicsFile <em>Graphics File</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSoftwareDevelopmentFile <em>Software Development File</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSoftwareDevelopmentFileFormat <em>Software Development File Format</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType()
 * @model extendedMetaData="name='MD_ApplicationSchemaInformation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDApplicationSchemaInformationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CICitationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Schema Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Language</em>' containment reference.
	 * @see #setSchemaLanguage(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_SchemaLanguage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schemaLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSchemaLanguage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSchemaLanguage <em>Schema Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Language</em>' containment reference.
	 * @see #getSchemaLanguage()
	 * @generated
	 */
	void setSchemaLanguage(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Constraint Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Language</em>' containment reference.
	 * @see #setConstraintLanguage(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_ConstraintLanguage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraintLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getConstraintLanguage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getConstraintLanguage <em>Constraint Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Language</em>' containment reference.
	 * @see #getConstraintLanguage()
	 * @generated
	 */
	void setConstraintLanguage(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Schema Ascii</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Ascii</em>' containment reference.
	 * @see #setSchemaAscii(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_SchemaAscii()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schemaAscii' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSchemaAscii();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSchemaAscii <em>Schema Ascii</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Ascii</em>' containment reference.
	 * @see #getSchemaAscii()
	 * @generated
	 */
	void setSchemaAscii(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Graphics File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphics File</em>' containment reference.
	 * @see #setGraphicsFile(BinaryPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_GraphicsFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphicsFile' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryPropertyType getGraphicsFile();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getGraphicsFile <em>Graphics File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics File</em>' containment reference.
	 * @see #getGraphicsFile()
	 * @generated
	 */
	void setGraphicsFile(BinaryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Software Development File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Development File</em>' containment reference.
	 * @see #setSoftwareDevelopmentFile(BinaryPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_SoftwareDevelopmentFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='softwareDevelopmentFile' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryPropertyType getSoftwareDevelopmentFile();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSoftwareDevelopmentFile <em>Software Development File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Development File</em>' containment reference.
	 * @see #getSoftwareDevelopmentFile()
	 * @generated
	 */
	void setSoftwareDevelopmentFile(BinaryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Software Development File Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Development File Format</em>' containment reference.
	 * @see #setSoftwareDevelopmentFileFormat(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDApplicationSchemaInformationType_SoftwareDevelopmentFileFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='softwareDevelopmentFileFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSoftwareDevelopmentFileFormat();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType#getSoftwareDevelopmentFileFormat <em>Software Development File Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Development File Format</em>' containment reference.
	 * @see #getSoftwareDevelopmentFileFormat()
	 * @generated
	 */
	void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType value);

} // MDApplicationSchemaInformationType
