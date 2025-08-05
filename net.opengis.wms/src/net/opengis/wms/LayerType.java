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
package net.opengis.wms;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.LayerType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getAuthorityURL <em>Authority URL</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getMetadataURL <em>Metadata URL</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getDataURL <em>Data URL</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getFeatureListURL <em>Feature List URL</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getLayer <em>Layer</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getCascaded <em>Cascaded</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getFixedHeight <em>Fixed Height</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#getFixedWidth <em>Fixed Width</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#isNoSubsets <em>No Subsets</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link net.opengis.wms.LayerType#isQueryable <em>Queryable</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getLayerType()
 * @model extendedMetaData="name='Layer_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LayerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Name is typically for machine-to-machine communication.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Title is for informative display to a human.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The abstract is a longer narrative description of an object.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         List of keywords or keyword phrases to help catalog searching.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword List</em>' containment reference.
	 * @see #setKeywordList(KeywordListType)
	 * @see net.opengis.wms.WMSPackage#getLayerType_KeywordList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeywordList' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordListType getKeywordList();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getKeywordList <em>Keyword List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword List</em>' containment reference.
	 * @see #getKeywordList()
	 * @generated
	 */
	void setKeywordList(KeywordListType value);

	/**
	 * Returns the value of the '<em><b>CRS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Identifier for a single Coordinate Reference System (CRS).
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRS</em>' attribute list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_CRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCRS();

	/**
	 * Returns the value of the '<em><b>EX Geographic Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The EX_GeographicBoundingBox attributes indicate the limits of the enclosing
	 *         rectangle in longitude and latitude decimal degrees.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #setEXGeographicBoundingBox(EXGeographicBoundingBoxType)
	 * @see net.opengis.wms.WMSPackage#getLayerType_EXGeographicBoundingBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EX_GeographicBoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	EXGeographicBoundingBoxType getEXGeographicBoundingBox();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #getEXGeographicBoundingBox()
	 * @generated
	 */
	void setEXGeographicBoundingBox(EXGeographicBoundingBoxType value);

	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.BoundingBoxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The BoundingBox attributes indicate the limits of the bounding box
	 *         in units of the specified coordinate reference system.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounding Box</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_BoundingBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BoundingBoxType> getBoundingBox();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Dimension element declares the existence of a dimension and indicates what
	 *         values along a dimension are valid.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_Dimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DimensionType> getDimension();

	/**
	 * Returns the value of the '<em><b>Attribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Attribution indicates the provider of a Layer or collection of Layers.
	 *         The provider's URL, descriptive title string, and/or logo image URL
	 *         may be supplied.  Client applications may choose to display one or
	 *         more of these items.  A format element indicates the MIME type of
	 *         the logo image located at LogoURL.  The logo image's width and height
	 *         assist client applications in laying out space to display the logo.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribution</em>' containment reference.
	 * @see #setAttribution(AttributionType)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Attribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribution' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributionType getAttribution();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getAttribution <em>Attribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution</em>' containment reference.
	 * @see #getAttribution()
	 * @generated
	 */
	void setAttribution(AttributionType value);

	/**
	 * Returns the value of the '<em><b>Authority URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.AuthorityURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more Identifier elements to list ID
	 *         numbers or labels defined by a particular Authority.  For example,
	 *         the Global Change Master Directory (gcmd.gsfc.nasa.gov) defines a
	 *         DIF_ID label for every dataset.  The authority name and explanatory
	 *         URL are defined in a separate AuthorityURL element, which may be
	 *         defined once and inherited by subsidiary layers.  Identifiers
	 *         themselves are not inherited.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority URL</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_AuthorityURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuthorityURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuthorityURLType> getAuthorityURL();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentifierType> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Metadata URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.MetadataURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more MetadataURL elements to offer
	 *         detailed, standardized metadata about the data underneath a
	 *         particular layer. The type attribute indicates the standard to which
	 *         the metadata complies.  The format element indicates how the metadata is structured.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata URL</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_MetadataURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MetadataURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetadataURLType> getMetadataURL();

	/**
	 * Returns the value of the '<em><b>Data URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.DataURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use DataURL offer a link to the underlying data represented
	 *         by a particular layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data URL</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_DataURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataURLType> getDataURL();

	/**
	 * Returns the value of the '<em><b>Feature List URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.FeatureListURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use FeatureListURL to point to a list of the
	 *         features represented in a Layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature List URL</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_FeatureListURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FeatureListURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureListURLType> getFeatureListURL();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.StyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Style element lists the name by which a style is requested and a
	 *         human-readable title for pick lists, optionally (and ideally)
	 *         provides a human-readable description, and optionally gives a style
	 *         URL.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_Style()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StyleType> getStyle();

	/**
	 * Returns the value of the '<em><b>Min Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Minimum scale denominator for which it is appropriate to
	 *         display this layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #isSetMinScaleDenominator()
	 * @see #unsetMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @see net.opengis.wms.WMSPackage#getLayerType_MinScaleDenominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MinScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinScaleDenominator();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #isSetMinScaleDenominator()
	 * @see #unsetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @generated
	 */
	void setMinScaleDenominator(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.LayerType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @generated
	 */
	void unsetMinScaleDenominator();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.LayerType#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Scale Denominator</em>' attribute is set.
	 * @see #unsetMinScaleDenominator()
	 * @see #getMinScaleDenominator()
	 * @see #setMinScaleDenominator(double)
	 * @generated
	 */
	boolean isSetMinScaleDenominator();

	/**
	 * Returns the value of the '<em><b>Max Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Maximum scale denominator for which it is appropriate to
	 *         display this layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #isSetMaxScaleDenominator()
	 * @see #unsetMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @see net.opengis.wms.WMSPackage#getLayerType_MaxScaleDenominator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='MaxScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxScaleDenominator();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #isSetMaxScaleDenominator()
	 * @see #unsetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @generated
	 */
	void setMaxScaleDenominator(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.LayerType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @generated
	 */
	void unsetMaxScaleDenominator();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.LayerType#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Scale Denominator</em>' attribute is set.
	 * @see #unsetMaxScaleDenominator()
	 * @see #getMaxScaleDenominator()
	 * @see #setMaxScaleDenominator(double)
	 * @generated
	 */
	boolean isSetMaxScaleDenominator();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.LayerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Nested list of zero or more map Layers offered by this server.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getLayerType_Layer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Layer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LayerType> getLayer();

	/**
	 * Returns the value of the '<em><b>Cascaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascaded</em>' attribute.
	 * @see #setCascaded(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Cascaded()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='cascaded'"
	 * @generated
	 */
	BigInteger getCascaded();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getCascaded <em>Cascaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascaded</em>' attribute.
	 * @see #getCascaded()
	 * @generated
	 */
	void setCascaded(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fixed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Height</em>' attribute.
	 * @see #setFixedHeight(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getLayerType_FixedHeight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='fixedHeight'"
	 * @generated
	 */
	BigInteger getFixedHeight();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getFixedHeight <em>Fixed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Height</em>' attribute.
	 * @see #getFixedHeight()
	 * @generated
	 */
	void setFixedHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fixed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Width</em>' attribute.
	 * @see #setFixedWidth(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getLayerType_FixedWidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='fixedWidth'"
	 * @generated
	 */
	BigInteger getFixedWidth();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#getFixedWidth <em>Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Width</em>' attribute.
	 * @see #getFixedWidth()
	 * @generated
	 */
	void setFixedWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>No Subsets</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Subsets</em>' attribute.
	 * @see #isSetNoSubsets()
	 * @see #unsetNoSubsets()
	 * @see #setNoSubsets(boolean)
	 * @see net.opengis.wms.WMSPackage#getLayerType_NoSubsets()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='noSubsets'"
	 * @generated
	 */
	boolean isNoSubsets();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#isNoSubsets <em>No Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Subsets</em>' attribute.
	 * @see #isSetNoSubsets()
	 * @see #unsetNoSubsets()
	 * @see #isNoSubsets()
	 * @generated
	 */
	void setNoSubsets(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.LayerType#isNoSubsets <em>No Subsets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoSubsets()
	 * @see #isNoSubsets()
	 * @see #setNoSubsets(boolean)
	 * @generated
	 */
	void unsetNoSubsets();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.LayerType#isNoSubsets <em>No Subsets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Subsets</em>' attribute is set.
	 * @see #unsetNoSubsets()
	 * @see #isNoSubsets()
	 * @see #setNoSubsets(boolean)
	 * @generated
	 */
	boolean isSetNoSubsets();

	/**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see #isSetOpaque()
	 * @see #unsetOpaque()
	 * @see #setOpaque(boolean)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Opaque()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='opaque'"
	 * @generated
	 */
	boolean isOpaque();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see #isSetOpaque()
	 * @see #unsetOpaque()
	 * @see #isOpaque()
	 * @generated
	 */
	void setOpaque(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.LayerType#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpaque()
	 * @see #isOpaque()
	 * @see #setOpaque(boolean)
	 * @generated
	 */
	void unsetOpaque();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.LayerType#isOpaque <em>Opaque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opaque</em>' attribute is set.
	 * @see #unsetOpaque()
	 * @see #isOpaque()
	 * @see #setOpaque(boolean)
	 * @generated
	 */
	boolean isSetOpaque();

	/**
	 * Returns the value of the '<em><b>Queryable</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queryable</em>' attribute.
	 * @see #isSetQueryable()
	 * @see #unsetQueryable()
	 * @see #setQueryable(boolean)
	 * @see net.opengis.wms.WMSPackage#getLayerType_Queryable()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='queryable'"
	 * @generated
	 */
	boolean isQueryable();

	/**
	 * Sets the value of the '{@link net.opengis.wms.LayerType#isQueryable <em>Queryable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queryable</em>' attribute.
	 * @see #isSetQueryable()
	 * @see #unsetQueryable()
	 * @see #isQueryable()
	 * @generated
	 */
	void setQueryable(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.LayerType#isQueryable <em>Queryable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryable()
	 * @see #isQueryable()
	 * @see #setQueryable(boolean)
	 * @generated
	 */
	void unsetQueryable();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.LayerType#isQueryable <em>Queryable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queryable</em>' attribute is set.
	 * @see #unsetQueryable()
	 * @see #isQueryable()
	 * @see #setQueryable(boolean)
	 * @generated
	 */
	boolean isSetQueryable();

} // LayerType
