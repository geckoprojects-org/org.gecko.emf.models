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

import javax.xml.namespace.QName;

import net.opengis.ows.KeywordsType;
import net.opengis.ows.WGS84BoundingBoxType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getDefaultCRS <em>Default CRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getOtherCRS <em>Other CRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getNoCRS <em>No CRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getMetadataURL <em>Metadata URL</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getExtendedDescription <em>Extended Description</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType()
 * @model extendedMetaData="name='FeatureTypeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(QName)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(QName value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Abstract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractType> getAbstract();

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.KeywordsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Keywords()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keywords' namespace='http://www.opengis.net/ows/1.1'"
	 * @generated
	 */
	EList<KeywordsType> getKeywords();

	/**
	 * Returns the value of the '<em><b>Default CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default CRS</em>' attribute.
	 * @see #setDefaultCRS(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_DefaultCRS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='DefaultCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultCRS();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getDefaultCRS <em>Default CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default CRS</em>' attribute.
	 * @see #getDefaultCRS()
	 * @generated
	 */
	void setDefaultCRS(String value);

	/**
	 * Returns the value of the '<em><b>Other CRS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other CRS</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_OtherCRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='OtherCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOtherCRS();

	/**
	 * Returns the value of the '<em><b>No CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No CRS</em>' containment reference.
	 * @see #setNoCRS(NoCRSType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_NoCRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NoCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	NoCRSType getNoCRS();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getNoCRS <em>No CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No CRS</em>' containment reference.
	 * @see #getNoCRS()
	 * @generated
	 */
	void setNoCRS(NoCRSType value);

	/**
	 * Returns the value of the '<em><b>Output Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Formats</em>' containment reference.
	 * @see #setOutputFormats(OutputFormatListType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_OutputFormats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutputFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputFormatListType getOutputFormats();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getOutputFormats <em>Output Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Formats</em>' containment reference.
	 * @see #getOutputFormats()
	 * @generated
	 */
	void setOutputFormats(OutputFormatListType value);

	/**
	 * Returns the value of the '<em><b>WGS84 Bounding Box</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.WGS84BoundingBoxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WGS84 Bounding Box</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_WGS84BoundingBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WGS84BoundingBox' namespace='http://www.opengis.net/ows/1.1'"
	 * @generated
	 */
	EList<WGS84BoundingBoxType> getWGS84BoundingBox();

	/**
	 * Returns the value of the '<em><b>Metadata URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.MetadataURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata URL</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_MetadataURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MetadataURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetadataURLType> getMetadataURL();

	/**
	 * Returns the value of the '<em><b>Extended Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Description</em>' containment reference.
	 * @see #setExtendedDescription(ExtendedDescriptionType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_ExtendedDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedDescriptionType getExtendedDescription();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getExtendedDescription <em>Extended Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Description</em>' containment reference.
	 * @see #getExtendedDescription()
	 * @generated
	 */
	void setExtendedDescription(ExtendedDescriptionType value);

} // FeatureTypeType
