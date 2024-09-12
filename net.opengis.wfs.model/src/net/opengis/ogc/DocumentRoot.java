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
package net.opengis.ogc;

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
 *   <li>{@link net.opengis.ogc.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getAdd <em>Add</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getAnd <em>And</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getBBOX <em>BBOX</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getBeyond <em>Beyond</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getContains <em>Contains</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getCrosses <em>Crosses</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getDisjoint <em>Disjoint</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getDiv <em>Div</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getDWithin <em>DWithin</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getEID <em>EID</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getEquals <em>Equals</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getFID <em>FID</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getFilterCapabilities <em>Filter Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getGmlObjectId <em>Gml Object Id</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getIntersects <em>Intersects</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getMul <em>Mul</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getNot <em>Not</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getOr <em>Or</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getOverlaps <em>Overlaps</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsBetween <em>Property Is Between</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsEqualTo <em>Property Is Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThan <em>Property Is Less Than</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsLike <em>Property Is Like</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyIsNull <em>Property Is Null</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getSimpleArithmetic <em>Simple Arithmetic</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getSub <em>Sub</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getTouches <em>Touches</em>}</li>
 *   <li>{@link net.opengis.ogc.DocumentRoot#getWithin <em>Within</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getDocumentRoot()
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
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Id()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Id' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractIdType getId();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(BinaryOperatorType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Add()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Add' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	BinaryOperatorType getAdd();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(BinaryOperatorType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Expression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getExpression();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(BinaryLogicOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_And()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	BinaryLogicOpType getAnd();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(BinaryLogicOpType value);

	/**
	 * Returns the value of the '<em><b>Logic Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_LogicOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicOps' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicOpsType getLogicOps();

	/**
	 * Returns the value of the '<em><b>BBOX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBOX</em>' containment reference.
	 * @see #setBBOX(BBOXType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_BBOX()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BBOX' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BBOXType getBBOX();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getBBOX <em>BBOX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BBOX</em>' containment reference.
	 * @see #getBBOX()
	 * @generated
	 */
	void setBBOX(BBOXType value);

	/**
	 * Returns the value of the '<em><b>Spatial Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_SpatialOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatialOps' namespace='##targetNamespace'"
	 * @generated
	 */
	SpatialOpsType getSpatialOps();

	/**
	 * Returns the value of the '<em><b>Beyond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beyond</em>' containment reference.
	 * @see #setBeyond(DistanceBufferType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Beyond()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Beyond' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	DistanceBufferType getBeyond();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getBeyond <em>Beyond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beyond</em>' containment reference.
	 * @see #getBeyond()
	 * @generated
	 */
	void setBeyond(DistanceBufferType value);

	/**
	 * Returns the value of the '<em><b>Comparison Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_ComparisonOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comparisonOps' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonOpsType getComparisonOps();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Contains()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contains' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getContains();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Crosses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crosses</em>' containment reference.
	 * @see #setCrosses(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Crosses()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Crosses' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getCrosses();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getCrosses <em>Crosses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crosses</em>' containment reference.
	 * @see #getCrosses()
	 * @generated
	 */
	void setCrosses(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Disjoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint</em>' containment reference.
	 * @see #setDisjoint(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Disjoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Disjoint' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getDisjoint();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getDisjoint <em>Disjoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint</em>' containment reference.
	 * @see #getDisjoint()
	 * @generated
	 */
	void setDisjoint(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(BinaryOperatorType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Div()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Div' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	BinaryOperatorType getDiv();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(BinaryOperatorType value);

	/**
	 * Returns the value of the '<em><b>DWithin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWithin</em>' containment reference.
	 * @see #setDWithin(DistanceBufferType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_DWithin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DWithin' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	DistanceBufferType getDWithin();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getDWithin <em>DWithin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWithin</em>' containment reference.
	 * @see #getDWithin()
	 * @generated
	 */
	void setDWithin(DistanceBufferType value);

	/**
	 * Returns the value of the '<em><b>EID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID</em>' containment reference.
	 * @see #setEID(EIDType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_EID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EID' namespace='##targetNamespace'"
	 * @generated
	 */
	EIDType getEID();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getEID <em>EID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EID</em>' containment reference.
	 * @see #getEID()
	 * @generated
	 */
	void setEID(EIDType value);

	/**
	 * Returns the value of the '<em><b>Equals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals</em>' containment reference.
	 * @see #setEquals(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Equals()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Equals' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getEquals();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getEquals <em>Equals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equals</em>' containment reference.
	 * @see #getEquals()
	 * @generated
	 */
	void setEquals(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Id</em>' containment reference.
	 * @see #setFeatureId(FeatureIdType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_FeatureId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureId' namespace='##targetNamespace' affiliation='_Id'"
	 * @generated
	 */
	FeatureIdType getFeatureId();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getFeatureId <em>Feature Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Id</em>' containment reference.
	 * @see #getFeatureId()
	 * @generated
	 */
	void setFeatureId(FeatureIdType value);

	/**
	 * Returns the value of the '<em><b>FID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FID</em>' containment reference.
	 * @see #setFID(FIDType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_FID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FID' namespace='##targetNamespace'"
	 * @generated
	 */
	FIDType getFID();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getFID <em>FID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FID</em>' containment reference.
	 * @see #getFID()
	 * @generated
	 */
	void setFID(FIDType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Capabilities</em>' containment reference.
	 * @see #setFilterCapabilities(FilterCapabilitiesType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_FilterCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterCapabilitiesType getFilterCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getFilterCapabilities <em>Filter Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Capabilities</em>' containment reference.
	 * @see #getFilterCapabilities()
	 * @generated
	 */
	void setFilterCapabilities(FilterCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(FunctionType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Function()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	FunctionType getFunction();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Gml Object Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Object Id</em>' containment reference.
	 * @see #setGmlObjectId(GmlObjectIdType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_GmlObjectId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GmlObjectId' namespace='##targetNamespace' affiliation='_Id'"
	 * @generated
	 */
	GmlObjectIdType getGmlObjectId();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getGmlObjectId <em>Gml Object Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Object Id</em>' containment reference.
	 * @see #getGmlObjectId()
	 * @generated
	 */
	void setGmlObjectId(GmlObjectIdType value);

	/**
	 * Returns the value of the '<em><b>Intersects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersects</em>' containment reference.
	 * @see #setIntersects(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Intersects()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Intersects' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getIntersects();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getIntersects <em>Intersects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersects</em>' containment reference.
	 * @see #getIntersects()
	 * @generated
	 */
	void setIntersects(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(LiteralType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	LiteralType getLiteral();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(LiteralType value);

	/**
	 * Returns the value of the '<em><b>Logical Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operators</em>' containment reference.
	 * @see #setLogicalOperators(LogicalOperatorsType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_LogicalOperators()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LogicalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalOperatorsType getLogicalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getLogicalOperators <em>Logical Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operators</em>' containment reference.
	 * @see #getLogicalOperators()
	 * @generated
	 */
	void setLogicalOperators(LogicalOperatorsType value);

	/**
	 * Returns the value of the '<em><b>Mul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mul</em>' containment reference.
	 * @see #setMul(BinaryOperatorType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Mul()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mul' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	BinaryOperatorType getMul();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getMul <em>Mul</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mul</em>' containment reference.
	 * @see #getMul()
	 * @generated
	 */
	void setMul(BinaryOperatorType value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(UnaryLogicOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Not()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	UnaryLogicOpType getNot();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(UnaryLogicOpType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(BinaryLogicOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Or()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	BinaryLogicOpType getOr();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BinaryLogicOpType value);

	/**
	 * Returns the value of the '<em><b>Overlaps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlaps</em>' containment reference.
	 * @see #setOverlaps(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Overlaps()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Overlaps' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getOverlaps();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getOverlaps <em>Overlaps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlaps</em>' containment reference.
	 * @see #getOverlaps()
	 * @generated
	 */
	void setOverlaps(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Between</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Between</em>' containment reference.
	 * @see #setPropertyIsBetween(PropertyIsBetweenType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsBetween()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsBetween' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsBetweenType getPropertyIsBetween();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsBetween <em>Property Is Between</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Between</em>' containment reference.
	 * @see #getPropertyIsBetween()
	 * @generated
	 */
	void setPropertyIsBetween(PropertyIsBetweenType value);

	/**
	 * Returns the value of the '<em><b>Property Is Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Equal To</em>' containment reference.
	 * @see #setPropertyIsEqualTo(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsEqualTo <em>Property Is Equal To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Equal To</em>' containment reference.
	 * @see #getPropertyIsEqualTo()
	 * @generated
	 */
	void setPropertyIsEqualTo(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Greater Than</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Greater Than</em>' containment reference.
	 * @see #setPropertyIsGreaterThan(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsGreaterThan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsGreaterThan' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsGreaterThan();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Greater Than</em>' containment reference.
	 * @see #getPropertyIsGreaterThan()
	 * @generated
	 */
	void setPropertyIsGreaterThan(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Greater Than Or Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Greater Than Or Equal To</em>' containment reference.
	 * @see #setPropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsGreaterThanOrEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsGreaterThanOrEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsGreaterThanOrEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Greater Than Or Equal To</em>' containment reference.
	 * @see #getPropertyIsGreaterThanOrEqualTo()
	 * @generated
	 */
	void setPropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Less Than</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Less Than</em>' containment reference.
	 * @see #setPropertyIsLessThan(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsLessThan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLessThan' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsLessThan();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThan <em>Property Is Less Than</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Less Than</em>' containment reference.
	 * @see #getPropertyIsLessThan()
	 * @generated
	 */
	void setPropertyIsLessThan(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Less Than Or Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Less Than Or Equal To</em>' containment reference.
	 * @see #setPropertyIsLessThanOrEqualTo(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsLessThanOrEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLessThanOrEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsLessThanOrEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Less Than Or Equal To</em>' containment reference.
	 * @see #getPropertyIsLessThanOrEqualTo()
	 * @generated
	 */
	void setPropertyIsLessThanOrEqualTo(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Like</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Like</em>' containment reference.
	 * @see #setPropertyIsLike(PropertyIsLikeType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsLike()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLike' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsLikeType getPropertyIsLike();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLike <em>Property Is Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Like</em>' containment reference.
	 * @see #getPropertyIsLike()
	 * @generated
	 */
	void setPropertyIsLike(PropertyIsLikeType value);

	/**
	 * Returns the value of the '<em><b>Property Is Not Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Not Equal To</em>' containment reference.
	 * @see #setPropertyIsNotEqualTo(BinaryComparisonOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsNotEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsNotEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsNotEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Not Equal To</em>' containment reference.
	 * @see #getPropertyIsNotEqualTo()
	 * @generated
	 */
	void setPropertyIsNotEqualTo(BinaryComparisonOpType value);

	/**
	 * Returns the value of the '<em><b>Property Is Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Null</em>' containment reference.
	 * @see #setPropertyIsNull(PropertyIsNullType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyIsNull()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsNull' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsNullType getPropertyIsNull();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyIsNull <em>Property Is Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Null</em>' containment reference.
	 * @see #getPropertyIsNull()
	 * @generated
	 */
	void setPropertyIsNull(PropertyIsNullType value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_PropertyName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	PropertyNameType getPropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(PropertyNameType value);

	/**
	 * Returns the value of the '<em><b>Simple Arithmetic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Arithmetic</em>' containment reference.
	 * @see #setSimpleArithmetic(SimpleArithmeticType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_SimpleArithmetic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleArithmetic' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleArithmeticType getSimpleArithmetic();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getSimpleArithmetic <em>Simple Arithmetic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Arithmetic</em>' containment reference.
	 * @see #getSimpleArithmetic()
	 * @generated
	 */
	void setSimpleArithmetic(SimpleArithmeticType value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(SortByType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_SortBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SortBy' namespace='##targetNamespace'"
	 * @generated
	 */
	SortByType getSortBy();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(SortByType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(BinaryOperatorType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Sub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sub' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	BinaryOperatorType getSub();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(BinaryOperatorType value);

	/**
	 * Returns the value of the '<em><b>Touches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touches</em>' containment reference.
	 * @see #setTouches(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Touches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Touches' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getTouches();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getTouches <em>Touches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touches</em>' containment reference.
	 * @see #getTouches()
	 * @generated
	 */
	void setTouches(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Within</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within</em>' containment reference.
	 * @see #setWithin(BinarySpatialOpType)
	 * @see net.opengis.ogc.OGCPackage#getDocumentRoot_Within()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Within' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getWithin();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DocumentRoot#getWithin <em>Within</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within</em>' containment reference.
	 * @see #getWithin()
	 * @generated
	 */
	void setWithin(BinarySpatialOpType value);

} // DocumentRoot
