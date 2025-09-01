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
package net.opengis.ogc.features;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getCollections <em>Collections</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getExceptionReport <em>Exception Report</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getSpatialExtent <em>Spatial Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getTemporalExtent <em>Temporal Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.DocumentRoot#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Begin)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Begin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	Begin getBegin();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Begin value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference.
	 * @see #setCollections(FeatureCollections)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Collections()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Collections' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureCollections getCollections();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getCollections <em>Collections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collections</em>' containment reference.
	 * @see #getCollections()
	 * @generated
	 */
	void setCollections(FeatureCollections value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference.
	 * @see #setConformsTo(ConformsTo)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_ConformsTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConformsTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformsTo getConformsTo();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getConformsTo <em>Conforms To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' containment reference.
	 * @see #getConformsTo()
	 * @generated
	 */
	void setConformsTo(ConformsTo value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(LanguageString)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LanguageString value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_End()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(net.opengis.ogc.features.Exception)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Exception()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Exception' namespace='##targetNamespace'"
	 * @generated
	 */
	net.opengis.ogc.features.Exception getException();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(net.opengis.ogc.features.Exception value);

	/**
	 * Returns the value of the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Report</em>' containment reference.
	 * @see #setExceptionReport(ExceptionReport)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_ExceptionReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExceptionReport' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionReport getExceptionReport();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getExceptionReport <em>Exception Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Report</em>' containment reference.
	 * @see #getExceptionReport()
	 * @generated
	 */
	void setExceptionReport(ExceptionReport value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(Extent)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Extent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Extent' namespace='##targetNamespace'"
	 * @generated
	 */
	Extent getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Extent value);

	/**
	 * Returns the value of the '<em><b>Landing Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Page</em>' containment reference.
	 * @see #setLandingPage(LandingPage)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_LandingPage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LandingPage' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingPage getLandingPage();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getLandingPage <em>Landing Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Page</em>' containment reference.
	 * @see #getLandingPage()
	 * @generated
	 */
	void setLandingPage(LandingPage value);

	/**
	 * Returns the value of the '<em><b>Spatial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial</em>' containment reference.
	 * @see #setSpatial(WGS84BoundingBox)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Spatial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Spatial' namespace='##targetNamespace' affiliation='SpatialExtent'"
	 * @generated
	 */
	WGS84BoundingBox getSpatial();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getSpatial <em>Spatial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial</em>' containment reference.
	 * @see #getSpatial()
	 * @generated
	 */
	void setSpatial(WGS84BoundingBox value);

	/**
	 * Returns the value of the '<em><b>Spatial Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Extent</em>' containment reference.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_SpatialExtent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpatialExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	SpatialExtent getSpatialExtent();

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(GregorianPeriod)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Temporal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Temporal' namespace='##targetNamespace' affiliation='TemporalExtent'"
	 * @generated
	 */
	GregorianPeriod getTemporal();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getTemporal <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(GregorianPeriod value);

	/**
	 * Returns the value of the '<em><b>Temporal Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Extent</em>' containment reference.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_TemporalExtent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalExtent getTemporalExtent();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(LanguageString)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(LanguageString value);

} // DocumentRoot
