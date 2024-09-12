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
package net.opengis.fes;

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
 *   <li>{@link net.opengis.fes.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAbstractAdhocQueryExpression <em>Abstract Adhoc Query Expression</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAbstractQueryExpression <em>Abstract Query Expression</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAbstractProjectionClause <em>Abstract Projection Clause</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAbstractSelectionClause <em>Abstract Selection Clause</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAbstractSortingClause <em>Abstract Sorting Clause</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAfter <em>After</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getTemporalOps <em>Temporal Ops</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAnd <em>And</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getAnyInteracts <em>Any Interacts</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getBBOX <em>BBOX</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getBefore <em>Before</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getBegins <em>Begins</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getBegunBy <em>Begun By</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getBeyond <em>Beyond</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getContains <em>Contains</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getCrosses <em>Crosses</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getDisjoint <em>Disjoint</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getDuring <em>During</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getDWithin <em>DWithin</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getEndedBy <em>Ended By</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getEnds <em>Ends</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getEquals <em>Equals</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getExtensionOps <em>Extension Ops</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getFilterCapabilities <em>Filter Capabilities</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getIntersects <em>Intersects</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getMeets <em>Meets</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getMetBy <em>Met By</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getNot <em>Not</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getOr <em>Or</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getOverlappedBy <em>Overlapped By</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getOverlaps <em>Overlaps</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsBetween <em>Property Is Between</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsEqualTo <em>Property Is Equal To</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsLessThan <em>Property Is Less Than</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsLike <em>Property Is Like</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsNil <em>Property Is Nil</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getPropertyIsNull <em>Property Is Null</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getTContains <em>TContains</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getTEquals <em>TEquals</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getTouches <em>Touches</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getTOverlaps <em>TOverlaps</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link net.opengis.fes.DocumentRoot#getWithin <em>Within</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getDocumentRoot()
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_XSISchemaLocation()
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Id()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Id' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractIdType getId();

	/**
	 * Returns the value of the '<em><b>Abstract Adhoc Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Adhoc Query Expression</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AbstractAdhocQueryExpression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractAdhocQueryExpression' namespace='##targetNamespace' affiliation='AbstractQueryExpression'"
	 * @generated
	 */
	AbstractAdhocQueryExpressionType getAbstractAdhocQueryExpression();

	/**
	 * Returns the value of the '<em><b>Abstract Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Query Expression</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AbstractQueryExpression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractQueryExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractQueryExpressionType getAbstractQueryExpression();

	/**
	 * Returns the value of the '<em><b>Abstract Projection Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Projection Clause</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AbstractProjectionClause()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractProjectionClause' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbstractProjectionClause();

	/**
	 * Returns the value of the '<em><b>Abstract Selection Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Selection Clause</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AbstractSelectionClause()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSelectionClause' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbstractSelectionClause();

	/**
	 * Returns the value of the '<em><b>Abstract Sorting Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sorting Clause</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AbstractSortingClause()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSortingClause' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbstractSortingClause();

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference.
	 * @see #setAfter(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_After()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='After' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getAfter();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getAfter <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' containment reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Temporal Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Ops</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_TemporalOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalOps' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalOpsType getTemporalOps();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(BinaryLogicOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_And()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	BinaryLogicOpType getAnd();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getAnd <em>And</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_LogicOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicOps' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicOpsType getLogicOps();

	/**
	 * Returns the value of the '<em><b>Any Interacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Interacts</em>' containment reference.
	 * @see #setAnyInteracts(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_AnyInteracts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnyInteracts' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getAnyInteracts();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getAnyInteracts <em>Any Interacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Interacts</em>' containment reference.
	 * @see #getAnyInteracts()
	 * @generated
	 */
	void setAnyInteracts(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>BBOX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBOX</em>' containment reference.
	 * @see #setBBOX(BBOXType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_BBOX()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BBOX' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BBOXType getBBOX();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getBBOX <em>BBOX</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_SpatialOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatialOps' namespace='##targetNamespace'"
	 * @generated
	 */
	SpatialOpsType getSpatialOps();

	/**
	 * Returns the value of the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' containment reference.
	 * @see #setBefore(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Before()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Before' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getBefore();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getBefore <em>Before</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' containment reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Begins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begins</em>' containment reference.
	 * @see #setBegins(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Begins()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Begins' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getBegins();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getBegins <em>Begins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begins</em>' containment reference.
	 * @see #getBegins()
	 * @generated
	 */
	void setBegins(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Begun By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begun By</em>' containment reference.
	 * @see #setBegunBy(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_BegunBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BegunBy' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getBegunBy();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getBegunBy <em>Begun By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begun By</em>' containment reference.
	 * @see #getBegunBy()
	 * @generated
	 */
	void setBegunBy(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Beyond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beyond</em>' containment reference.
	 * @see #setBeyond(DistanceBufferType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Beyond()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Beyond' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	DistanceBufferType getBeyond();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getBeyond <em>Beyond</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_ComparisonOps()
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Contains()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contains' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getContains();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getContains <em>Contains</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Crosses()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Crosses' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getCrosses();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getCrosses <em>Crosses</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Disjoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Disjoint' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getDisjoint();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getDisjoint <em>Disjoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint</em>' containment reference.
	 * @see #getDisjoint()
	 * @generated
	 */
	void setDisjoint(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_During()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='During' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getDuring();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>DWithin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWithin</em>' containment reference.
	 * @see #setDWithin(DistanceBufferType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_DWithin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DWithin' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	DistanceBufferType getDWithin();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getDWithin <em>DWithin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWithin</em>' containment reference.
	 * @see #getDWithin()
	 * @generated
	 */
	void setDWithin(DistanceBufferType value);

	/**
	 * Returns the value of the '<em><b>Ended By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended By</em>' containment reference.
	 * @see #setEndedBy(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_EndedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndedBy' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getEndedBy();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getEndedBy <em>Ended By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ended By</em>' containment reference.
	 * @see #getEndedBy()
	 * @generated
	 */
	void setEndedBy(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference.
	 * @see #setEnds(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Ends()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ends' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getEnds();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getEnds <em>Ends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends</em>' containment reference.
	 * @see #getEnds()
	 * @generated
	 */
	void setEnds(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Equals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals</em>' containment reference.
	 * @see #setEquals(BinarySpatialOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Equals()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Equals' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getEquals();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getEquals <em>Equals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equals</em>' containment reference.
	 * @see #getEquals()
	 * @generated
	 */
	void setEquals(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Expression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExpression();

	/**
	 * Returns the value of the '<em><b>Extension Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Ops</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_ExtensionOps()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionOps' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionOpsType getExtensionOps();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace' affiliation='AbstractSelectionClause'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_FilterCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterCapabilitiesType getFilterCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getFilterCapabilities <em>Filter Capabilities</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Function()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	FunctionType getFunction();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Intersects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersects</em>' containment reference.
	 * @see #setIntersects(BinarySpatialOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Intersects()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Intersects' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getIntersects();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getIntersects <em>Intersects</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	LiteralType getLiteral();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_LogicalOperators()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LogicalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalOperatorsType getLogicalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getLogicalOperators <em>Logical Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operators</em>' containment reference.
	 * @see #getLogicalOperators()
	 * @generated
	 */
	void setLogicalOperators(LogicalOperatorsType value);

	/**
	 * Returns the value of the '<em><b>Meets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meets</em>' containment reference.
	 * @see #setMeets(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Meets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Meets' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getMeets();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getMeets <em>Meets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meets</em>' containment reference.
	 * @see #getMeets()
	 * @generated
	 */
	void setMeets(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Met By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Met By</em>' containment reference.
	 * @see #setMetBy(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_MetBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetBy' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getMetBy();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getMetBy <em>Met By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Met By</em>' containment reference.
	 * @see #getMetBy()
	 * @generated
	 */
	void setMetBy(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(UnaryLogicOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Not()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	UnaryLogicOpType getNot();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getNot <em>Not</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Or()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' namespace='##targetNamespace' affiliation='logicOps'"
	 * @generated
	 */
	BinaryLogicOpType getOr();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(BinaryLogicOpType value);

	/**
	 * Returns the value of the '<em><b>Overlapped By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlapped By</em>' containment reference.
	 * @see #setOverlappedBy(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_OverlappedBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OverlappedBy' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getOverlappedBy();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getOverlappedBy <em>Overlapped By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlapped By</em>' containment reference.
	 * @see #getOverlappedBy()
	 * @generated
	 */
	void setOverlappedBy(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Overlaps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlaps</em>' containment reference.
	 * @see #setOverlaps(BinarySpatialOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Overlaps()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Overlaps' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getOverlaps();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getOverlaps <em>Overlaps</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsBetween()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsBetween' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsBetweenType getPropertyIsBetween();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsBetween <em>Property Is Between</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsEqualTo <em>Property Is Equal To</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsGreaterThan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsGreaterThan' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsGreaterThan();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsGreaterThanOrEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsGreaterThanOrEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsGreaterThanOrEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsLessThan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLessThan' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsLessThan();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsLessThan <em>Property Is Less Than</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsLessThanOrEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLessThanOrEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsLessThanOrEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsLike()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsLike' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsLikeType getPropertyIsLike();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsLike <em>Property Is Like</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Like</em>' containment reference.
	 * @see #getPropertyIsLike()
	 * @generated
	 */
	void setPropertyIsLike(PropertyIsLikeType value);

	/**
	 * Returns the value of the '<em><b>Property Is Nil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Nil</em>' containment reference.
	 * @see #setPropertyIsNil(PropertyIsNilType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsNil()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsNil' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsNilType getPropertyIsNil();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsNil <em>Property Is Nil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Nil</em>' containment reference.
	 * @see #getPropertyIsNil()
	 * @generated
	 */
	void setPropertyIsNil(PropertyIsNilType value);

	/**
	 * Returns the value of the '<em><b>Property Is Not Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Not Equal To</em>' containment reference.
	 * @see #setPropertyIsNotEqualTo(BinaryComparisonOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsNotEqualTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsNotEqualTo' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	BinaryComparisonOpType getPropertyIsNotEqualTo();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}' containment reference.
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
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_PropertyIsNull()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PropertyIsNull' namespace='##targetNamespace' affiliation='comparisonOps'"
	 * @generated
	 */
	PropertyIsNullType getPropertyIsNull();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getPropertyIsNull <em>Property Is Null</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Null</em>' containment reference.
	 * @see #getPropertyIsNull()
	 * @generated
	 */
	void setPropertyIsNull(PropertyIsNullType value);

	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Id</em>' containment reference.
	 * @see #setResourceId(ResourceIdType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_ResourceId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceId' namespace='##targetNamespace' affiliation='_Id'"
	 * @generated
	 */
	ResourceIdType getResourceId();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getResourceId <em>Resource Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Id</em>' containment reference.
	 * @see #getResourceId()
	 * @generated
	 */
	void setResourceId(ResourceIdType value);

	/**
	 * Returns the value of the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By</em>' containment reference.
	 * @see #setSortBy(SortByType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_SortBy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SortBy' namespace='##targetNamespace' affiliation='AbstractSortingClause'"
	 * @generated
	 */
	SortByType getSortBy();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getSortBy <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By</em>' containment reference.
	 * @see #getSortBy()
	 * @generated
	 */
	void setSortBy(SortByType value);

	/**
	 * Returns the value of the '<em><b>TContains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TContains</em>' containment reference.
	 * @see #setTContains(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_TContains()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TContains' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getTContains();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getTContains <em>TContains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TContains</em>' containment reference.
	 * @see #getTContains()
	 * @generated
	 */
	void setTContains(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>TEquals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TEquals</em>' containment reference.
	 * @see #setTEquals(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_TEquals()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TEquals' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getTEquals();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getTEquals <em>TEquals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TEquals</em>' containment reference.
	 * @see #getTEquals()
	 * @generated
	 */
	void setTEquals(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Touches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touches</em>' containment reference.
	 * @see #setTouches(BinarySpatialOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Touches()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Touches' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getTouches();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getTouches <em>Touches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touches</em>' containment reference.
	 * @see #getTouches()
	 * @generated
	 */
	void setTouches(BinarySpatialOpType value);

	/**
	 * Returns the value of the '<em><b>TOverlaps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOverlaps</em>' containment reference.
	 * @see #setTOverlaps(BinaryTemporalOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_TOverlaps()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TOverlaps' namespace='##targetNamespace' affiliation='temporalOps'"
	 * @generated
	 */
	BinaryTemporalOpType getTOverlaps();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getTOverlaps <em>TOverlaps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOverlaps</em>' containment reference.
	 * @see #getTOverlaps()
	 * @generated
	 */
	void setTOverlaps(BinaryTemporalOpType value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' attribute.
	 * @see #setValueReference(String)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_ValueReference()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueReference' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	String getValueReference();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getValueReference <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' attribute.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(String value);

	/**
	 * Returns the value of the '<em><b>Within</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within</em>' containment reference.
	 * @see #setWithin(BinarySpatialOpType)
	 * @see net.opengis.fes.FESPackage#getDocumentRoot_Within()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Within' namespace='##targetNamespace' affiliation='spatialOps'"
	 * @generated
	 */
	BinarySpatialOpType getWithin();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DocumentRoot#getWithin <em>Within</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within</em>' containment reference.
	 * @see #getWithin()
	 * @generated
	 */
	void setWithin(BinarySpatialOpType value);

} // DocumentRoot
