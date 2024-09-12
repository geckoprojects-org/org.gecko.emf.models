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
package net.opengis.wfs;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata URL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             A Web Feature Server MAY use zero or more MetadataURL
 *             elements to offer detailed, standardized metadata about
 *             the data underneath a particular feature type.  The type
 *             attribute indicates the standard to which the metadata
 *             complies; the format attribute indicates how the metadata is
 *             structured.  Two types are defined at present:
 *             'TC211' or 'ISO19115' = ISO TC211 19115; 
 *             'FGDC'                = FGDC CSDGM.
 *             'ISO19139'            = ISO 19139
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.MetadataURLType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wfs.MetadataURLType#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getMetadataURLType()
 * @model extendedMetaData="name='MetadataURLType' kind='simple'"
 * @generated
 */
@ProviderType
public interface MetadataURLType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.wfs.WFSPackage#getMetadataURLType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.MetadataURLType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.wfs.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see net.opengis.wfs.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(FormatType)
	 * @see net.opengis.wfs.WFSPackage#getMetadataURLType_Format()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='format'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.MetadataURLType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see net.opengis.wfs.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.MetadataURLType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.MetadataURLType#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.wfs.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.opengis.wfs.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see net.opengis.wfs.WFSPackage#getMetadataURLType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.opengis.wfs.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // MetadataURLType
