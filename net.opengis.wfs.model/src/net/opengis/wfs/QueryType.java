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

import java.util.List;

import javax.xml.namespace.QName;

import net.opengis.ogc.FilterType;
import net.opengis.ogc.FunctionType;
import net.opengis.ogc.SortByType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             The Query element is of type QueryType.
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.QueryType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getXlinkPropertyName <em>Xlink Property Name</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getFeatureVersion <em>Feature Version</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getHandle <em>Handle</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.wfs.QueryType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getQueryType()
 * @model extendedMetaData="name='QueryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getQueryType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                    The Property element is used to specify one or more
	 *                    properties of a feature whose values are to be retrieved
	 *                    by a Web Feature Service.  
	 *                    
	 *                    While a Web Feature Service should endeavour to satisfy
	 *                    the exact request specified, in some instance this may
	 *                    not be possible.  Specifically, a Web Feature Service
	 *                    must generate a valid GML3 response to a Query operation.
	 *                    The schema used to generate the output may include 
	 *                    properties that are mandatory.  In order that the output
	 *                    validates, these mandatory properties must be specified
	 *                    in the request.  If they are not, a Web Feature Service
	 *                    may add them automatically to the Query before processing
	 *                    it.  Thus a client application should, in general, be
	 *                    prepared to receive more properties than it requested.
	 *    
	 *                    Of course, using the DescribeFeatureType request, a client
	 *                    application can determine which properties are mandatory
	 *                    and request them in the first place.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getQueryType_PropertyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getPropertyName();

	/**
	 * Returns the value of the '<em><b>Xlink Property Name</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.XlinkPropertyNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This element may be used in place of an wfs:PropertyName element
	 *             in a wfs:Query element in a wfs:GetFeature element to selectively
	 *             request the traversal of nested XLinks in the returned element for
	 *             the named property. This element may not be used in other requests
	 *             -- GetFeatureWithLock, LockFeature, Insert, Update, Delete -- in
	 *             this version of the WFS specification.
	 *          
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xlink Property Name</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getQueryType_XlinkPropertyName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XlinkPropertyName' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<XlinkPropertyNameType> getXlinkPropertyName();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                    A function may be used as a select item in a query.
	 *                    However, if a function is used, care must be taken
	 *                    to ensure that the result type matches the type in the 
	 *  
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getQueryType_Function()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='http://www.opengis.net/ogc' group='#group:0'"
	 * @generated
	 */
	EList<FunctionType> getFunction();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Filter element is used to define spatial and/or non-spatial
	 *                 constraints on query.  Spatial constrains use GML3 to specify
	 *                 the constraining geometry.  A full description of the Filter
	 *                 element can be found in the Filter Encoding Implementation
	 *                 Specification.
	 *              
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='http://www.opengis.net/ogc'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The SortBy element is used specify property names whose
	 *                 values should be used to order (upon presentation) the
	 *                 set of feature instances that satisfy the query.
	 *              
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(SortByType)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_SortBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SortBy' namespace='http://www.opengis.net/ogc'"
	 * @generated
	 */
	SortByType getSortBy();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(SortByType value);

	/**
	 * Returns the value of the '<em><b>Feature Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               For systems that implement versioning, the featureVersion
	 *               attribute is used to specify which version of a particular
	 *               feature instance is to be retrieved.  A value of ALL means
	 *               that all versions should be retrieved.  An integer value
	 *               'i', means that the ith version should be retrieve if it
	 *               exists or the most recent version otherwise.
	 *            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Version</em>' attribute.
	 * @see #setFeatureVersion(String)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_FeatureVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='featureVersion'"
	 * @generated
	 */
	String getFeatureVersion();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getFeatureVersion <em>Feature Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Version</em>' attribute.
	 * @see #getFeatureVersion()
	 * @generated
	 */
	void setFeatureVersion(String value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                The handle attribute allows a client application
	 *                to assign a client-generated identifier for the 
	 *                Query.  The handle is included to facilitate error
	 *                reporting.  If one Query in a GetFeature request
	 *                causes an exception, a WFS may report the handle
	 *                to indicate which query element failed.  If the a
	 *                handle is not present, the WFS may use other means
	 *                to localize the error (e.g. line numbers).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_Handle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handle'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               This attribute is used to specify a specific WFS-supported SRS
	 *               that should be used for returned feature geometries.  The value
	 *               may be the WFS StorageSRS value, DefaultRetrievalSRS value, or
	 *               one of AdditionalSRS values.  If no srsName value is supplied,
	 *               then the features will be returned using either the
	 *               DefaultRetrievalSRS, if specified, and StorageSRS otherwise.
	 *               For feature types with no spatial properties, this attribute
	 *               must not be specified or ignored if it is specified.
	 *            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The typeName attribute is a list of one or more
	 *               feature type names that indicate which types 
	 *               of feature instances should be included in the
	 *               reponse set.  Specifying more than one typename
	 *               indicates that a join operation is being performed.
	 *               All the names in the typeName list must be valid
	 *               types that belong to this query's feature content
	 *               as defined by the GML Application Schema.
	 *            
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(List)
	 * @see net.opengis.wfs.WFSPackage#getQueryType_TypeName()
	 * @model dataType="net.opengis.wfs.TypeNameListType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='typeName'"
	 * @generated
	 */
	List<QName> getTypeName();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.QueryType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(List<QName> value);

} // QueryType
