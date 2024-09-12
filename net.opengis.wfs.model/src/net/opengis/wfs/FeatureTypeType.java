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
 * <!-- begin-model-doc -->
 * 
 *             An element of this type that describes a feature in an application
 *             namespace shall have an xml xmlns specifier, e.g.
 *             xmlns:bo="http://www.BlueOx.org/BlueOx"
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getDefaultSRS <em>Default SRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getOtherSRS <em>Other SRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getNoSRS <em>No SRS</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getOperations <em>Operations</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeType#getMetadataURL <em>Metadata URL</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * 
	 *                   Name of this feature type, including any namespace prefix
	 *                
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Title of this feature type, normally used for display
	 *                   to a human.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getTitle <em>Title</em>}' attribute.
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
	 *                   Brief narrative description of this feature type, normally
	 *                   used for display to a human.
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.KeywordsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Keywords()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Keywords' namespace='http://www.opengis.net/ows'"
	 * @generated
	 */
	EList<KeywordsType> getKeywords();

	/**
	 * Returns the value of the '<em><b>Default SRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The DefaultSRS element indicated which spatial
	 *                         reference system shall be used by a WFS to
	 *                         express the state of a spatial feature if not
	 *                         otherwise explicitly identified within a query
	 *                         or transaction request.  The SRS may be indicated
	 *                         using either the EPSG form (EPSG:posc code) or
	 *                         the URL form defined in subclause 4.3.2 of
	 *                         refernce[2].
	 *                      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default SRS</em>' attribute.
	 * @see #setDefaultSRS(String)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_DefaultSRS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='DefaultSRS' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultSRS();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getDefaultSRS <em>Default SRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default SRS</em>' attribute.
	 * @see #getDefaultSRS()
	 * @generated
	 */
	void setDefaultSRS(String value);

	/**
	 * Returns the value of the '<em><b>Other SRS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The OtherSRS element is used to indicate other 
	 *                         supported SRSs within query and transaction 
	 *                         operations.  A supported SRS means that the 
	 *                         WFS supports the transformation of spatial
	 *                         properties between the OtherSRS and the internal
	 *                         storage SRS.  The effects of such transformations 
	 *                         must be considered when determining and declaring 
	 *                         the guaranteed data accuracy.
	 *                      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other SRS</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_OtherSRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='OtherSRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOtherSRS();

	/**
	 * Returns the value of the '<em><b>No SRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No SRS</em>' containment reference.
	 * @see #setNoSRS(NoSRSType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_NoSRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NoSRS' namespace='##targetNamespace'"
	 * @generated
	 */
	NoSRSType getNoSRS();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getNoSRS <em>No SRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No SRS</em>' containment reference.
	 * @see #getNoSRS()
	 * @generated
	 */
	void setNoSRS(NoSRSType value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(OperationsType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeType_Operations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Operations' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationsType getOperations();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeType#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationsType value);

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
	 *        extendedMetaData="kind='element' name='WGS84BoundingBox' namespace='http://www.opengis.net/ows'"
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

} // FeatureTypeType
