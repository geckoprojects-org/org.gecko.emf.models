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
package net.opengis.ogc.impl;

import net.opengis.ogc.AbstractIdType;
import net.opengis.ogc.BBOXType;
import net.opengis.ogc.BinaryComparisonOpType;
import net.opengis.ogc.BinaryLogicOpType;
import net.opengis.ogc.BinaryOperatorType;
import net.opengis.ogc.BinarySpatialOpType;
import net.opengis.ogc.ComparisonOpsType;
import net.opengis.ogc.DistanceBufferType;
import net.opengis.ogc.DocumentRoot;
import net.opengis.ogc.EIDType;
import net.opengis.ogc.ExpressionType;
import net.opengis.ogc.FIDType;
import net.opengis.ogc.FeatureIdType;
import net.opengis.ogc.FilterCapabilitiesType;
import net.opengis.ogc.FilterType;
import net.opengis.ogc.FunctionType;
import net.opengis.ogc.GmlObjectIdType;
import net.opengis.ogc.LiteralType;
import net.opengis.ogc.LogicOpsType;
import net.opengis.ogc.LogicalOperatorsType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.PropertyIsBetweenType;
import net.opengis.ogc.PropertyIsLikeType;
import net.opengis.ogc.PropertyIsNullType;
import net.opengis.ogc.PropertyNameType;
import net.opengis.ogc.SimpleArithmeticType;
import net.opengis.ogc.SortByType;
import net.opengis.ogc.SpatialOpsType;
import net.opengis.ogc.UnaryLogicOpType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getAnd <em>And</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getBBOX <em>BBOX</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getBeyond <em>Beyond</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getCrosses <em>Crosses</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getDisjoint <em>Disjoint</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getDWithin <em>DWithin</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getEID <em>EID</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getEquals <em>Equals</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getFID <em>FID</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getFilterCapabilities <em>Filter Capabilities</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getGmlObjectId <em>Gml Object Id</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getIntersects <em>Intersects</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getMul <em>Mul</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getNot <em>Not</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getOr <em>Or</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getOverlaps <em>Overlaps</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsBetween <em>Property Is Between</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsEqualTo <em>Property Is Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsLessThan <em>Property Is Less Than</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsLike <em>Property Is Like</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyIsNull <em>Property Is Null</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getSimpleArithmetic <em>Simple Arithmetic</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getTouches <em>Touches</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.DocumentRootImpl#getWithin <em>Within</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OGCPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractIdType getId() {
		return (AbstractIdType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(AbstractIdType newId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__ID, newId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperatorType getAdd() {
		return (BinaryOperatorType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__ADD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(BinaryOperatorType newAdd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__ADD, newAdd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdd(BinaryOperatorType newAdd) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__ADD, newAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType getExpression() {
		return (ExpressionType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ExpressionType newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicOpType getAnd() {
		return (BinaryLogicOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnd(BinaryLogicOpType newAnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__AND, newAnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnd(BinaryLogicOpType newAnd) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__AND, newAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicOpsType getLogicOps() {
		return (LogicOpsType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__LOGIC_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicOps(LogicOpsType newLogicOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__LOGIC_OPS, newLogicOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBOXType getBBOX() {
		return (BBOXType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__BBOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBBOX(BBOXType newBBOX, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__BBOX, newBBOX, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBBOX(BBOXType newBBOX) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__BBOX, newBBOX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOpsType getSpatialOps() {
		return (SpatialOpsType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__SPATIAL_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialOps(SpatialOpsType newSpatialOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__SPATIAL_OPS, newSpatialOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceBufferType getBeyond() {
		return (DistanceBufferType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__BEYOND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeyond(DistanceBufferType newBeyond, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__BEYOND, newBeyond, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeyond(DistanceBufferType newBeyond) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__BEYOND, newBeyond);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOpsType getComparisonOps() {
		return (ComparisonOpsType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__COMPARISON_OPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOps(ComparisonOpsType newComparisonOps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__COMPARISON_OPS, newComparisonOps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getContains() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__CONTAINS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(BinarySpatialOpType newContains, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__CONTAINS, newContains, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContains(BinarySpatialOpType newContains) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__CONTAINS, newContains);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getCrosses() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__CROSSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrosses(BinarySpatialOpType newCrosses, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__CROSSES, newCrosses, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrosses(BinarySpatialOpType newCrosses) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__CROSSES, newCrosses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getDisjoint() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__DISJOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisjoint(BinarySpatialOpType newDisjoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__DISJOINT, newDisjoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjoint(BinarySpatialOpType newDisjoint) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__DISJOINT, newDisjoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperatorType getDiv() {
		return (BinaryOperatorType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__DIV, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiv(BinaryOperatorType newDiv, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__DIV, newDiv, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiv(BinaryOperatorType newDiv) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__DIV, newDiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceBufferType getDWithin() {
		return (DistanceBufferType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__DWITHIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWithin(DistanceBufferType newDWithin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__DWITHIN, newDWithin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDWithin(DistanceBufferType newDWithin) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__DWITHIN, newDWithin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EIDType getEID() {
		return (EIDType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__EID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEID(EIDType newEID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__EID, newEID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEID(EIDType newEID) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__EID, newEID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getEquals() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__EQUALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquals(BinarySpatialOpType newEquals, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__EQUALS, newEquals, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquals(BinarySpatialOpType newEquals) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__EQUALS, newEquals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureIdType getFeatureId() {
		return (FeatureIdType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureId(FeatureIdType newFeatureId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__FEATURE_ID, newFeatureId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureId(FeatureIdType newFeatureId) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__FEATURE_ID, newFeatureId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FIDType getFID() {
		return (FIDType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__FID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFID(FIDType newFID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__FID, newFID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFID(FIDType newFID) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__FID, newFID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType getFilter() {
		return (FilterType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__FILTER, newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(FilterType newFilter) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__FILTER, newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterCapabilitiesType getFilterCapabilities() {
		return (FilterCapabilitiesType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__FILTER_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterCapabilities(FilterCapabilitiesType newFilterCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__FILTER_CAPABILITIES, newFilterCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterCapabilities(FilterCapabilitiesType newFilterCapabilities) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__FILTER_CAPABILITIES, newFilterCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionType getFunction() {
		return (FunctionType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(FunctionType newFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__FUNCTION, newFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(FunctionType newFunction) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__FUNCTION, newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GmlObjectIdType getGmlObjectId() {
		return (GmlObjectIdType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__GML_OBJECT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlObjectId(GmlObjectIdType newGmlObjectId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__GML_OBJECT_ID, newGmlObjectId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGmlObjectId(GmlObjectIdType newGmlObjectId) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__GML_OBJECT_ID, newGmlObjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getIntersects() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__INTERSECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntersects(BinarySpatialOpType newIntersects, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__INTERSECTS, newIntersects, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntersects(BinarySpatialOpType newIntersects) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__INTERSECTS, newIntersects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType getLiteral() {
		return (LiteralType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(LiteralType newLiteral, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteral(LiteralType newLiteral) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__LITERAL, newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperatorsType getLogicalOperators() {
		return (LogicalOperatorsType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__LOGICAL_OPERATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalOperators(LogicalOperatorsType newLogicalOperators, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__LOGICAL_OPERATORS, newLogicalOperators, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalOperators(LogicalOperatorsType newLogicalOperators) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__LOGICAL_OPERATORS, newLogicalOperators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperatorType getMul() {
		return (BinaryOperatorType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__MUL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMul(BinaryOperatorType newMul, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__MUL, newMul, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMul(BinaryOperatorType newMul) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__MUL, newMul);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicOpType getNot() {
		return (UnaryLogicOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__NOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(UnaryLogicOpType newNot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__NOT, newNot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNot(UnaryLogicOpType newNot) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__NOT, newNot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicOpType getOr() {
		return (BinaryLogicOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__OR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOr(BinaryLogicOpType newOr, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__OR, newOr, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOr(BinaryLogicOpType newOr) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__OR, newOr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getOverlaps() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__OVERLAPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlaps(BinarySpatialOpType newOverlaps, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__OVERLAPS, newOverlaps, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlaps(BinarySpatialOpType newOverlaps) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__OVERLAPS, newOverlaps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsBetweenType getPropertyIsBetween() {
		return (PropertyIsBetweenType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsBetween(PropertyIsBetweenType newPropertyIsBetween, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN, newPropertyIsBetween, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsBetween(PropertyIsBetweenType newPropertyIsBetween) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN, newPropertyIsBetween);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsEqualTo() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsEqualTo(BinaryComparisonOpType newPropertyIsEqualTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO, newPropertyIsEqualTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsEqualTo(BinaryComparisonOpType newPropertyIsEqualTo) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO, newPropertyIsEqualTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsGreaterThan() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsGreaterThan(BinaryComparisonOpType newPropertyIsGreaterThan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN, newPropertyIsGreaterThan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsGreaterThan(BinaryComparisonOpType newPropertyIsGreaterThan) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN, newPropertyIsGreaterThan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsGreaterThanOrEqualTo() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType newPropertyIsGreaterThanOrEqualTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO, newPropertyIsGreaterThanOrEqualTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsGreaterThanOrEqualTo(BinaryComparisonOpType newPropertyIsGreaterThanOrEqualTo) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO, newPropertyIsGreaterThanOrEqualTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsLessThan() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsLessThan(BinaryComparisonOpType newPropertyIsLessThan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN, newPropertyIsLessThan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsLessThan(BinaryComparisonOpType newPropertyIsLessThan) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN, newPropertyIsLessThan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsLessThanOrEqualTo() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsLessThanOrEqualTo(BinaryComparisonOpType newPropertyIsLessThanOrEqualTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO, newPropertyIsLessThanOrEqualTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsLessThanOrEqualTo(BinaryComparisonOpType newPropertyIsLessThanOrEqualTo) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO, newPropertyIsLessThanOrEqualTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsLikeType getPropertyIsLike() {
		return (PropertyIsLikeType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LIKE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsLike(PropertyIsLikeType newPropertyIsLike, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LIKE, newPropertyIsLike, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsLike(PropertyIsLikeType newPropertyIsLike) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_LIKE, newPropertyIsLike);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType getPropertyIsNotEqualTo() {
		return (BinaryComparisonOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsNotEqualTo(BinaryComparisonOpType newPropertyIsNotEqualTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO, newPropertyIsNotEqualTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsNotEqualTo(BinaryComparisonOpType newPropertyIsNotEqualTo) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO, newPropertyIsNotEqualTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsNullType getPropertyIsNull() {
		return (PropertyIsNullType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NULL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyIsNull(PropertyIsNullType newPropertyIsNull, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NULL, newPropertyIsNull, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyIsNull(PropertyIsNullType newPropertyIsNull) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_IS_NULL, newPropertyIsNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType getPropertyName() {
		return (PropertyNameType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(PropertyNameType newPropertyName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(PropertyNameType newPropertyName) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleArithmeticType getSimpleArithmetic() {
		return (SimpleArithmeticType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__SIMPLE_ARITHMETIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleArithmetic(SimpleArithmeticType newSimpleArithmetic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__SIMPLE_ARITHMETIC, newSimpleArithmetic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleArithmetic(SimpleArithmeticType newSimpleArithmetic) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__SIMPLE_ARITHMETIC, newSimpleArithmetic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortByType getSortBy() {
		return (SortByType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__SORT_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortBy(SortByType newSortBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__SORT_BY, newSortBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSortBy(SortByType newSortBy) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__SORT_BY, newSortBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperatorType getSub() {
		return (BinaryOperatorType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__SUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(BinaryOperatorType newSub, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__SUB, newSub, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSub(BinaryOperatorType newSub) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__SUB, newSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getTouches() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__TOUCHES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTouches(BinarySpatialOpType newTouches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__TOUCHES, newTouches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTouches(BinarySpatialOpType newTouches) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__TOUCHES, newTouches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType getWithin() {
		return (BinarySpatialOpType)getMixed().get(OGCPackage.Literals.DOCUMENT_ROOT__WITHIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithin(BinarySpatialOpType newWithin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCPackage.Literals.DOCUMENT_ROOT__WITHIN, newWithin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithin(BinarySpatialOpType newWithin) {
		((FeatureMap.Internal)getMixed()).set(OGCPackage.Literals.DOCUMENT_ROOT__WITHIN, newWithin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OGCPackage.DOCUMENT_ROOT__ID:
				return basicSetId(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__ADD:
				return basicSetAdd(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__AND:
				return basicSetAnd(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__LOGIC_OPS:
				return basicSetLogicOps(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__BBOX:
				return basicSetBBOX(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__SPATIAL_OPS:
				return basicSetSpatialOps(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__BEYOND:
				return basicSetBeyond(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__COMPARISON_OPS:
				return basicSetComparisonOps(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__CONTAINS:
				return basicSetContains(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__CROSSES:
				return basicSetCrosses(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__DISJOINT:
				return basicSetDisjoint(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__DIV:
				return basicSetDiv(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__DWITHIN:
				return basicSetDWithin(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__EID:
				return basicSetEID(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__EQUALS:
				return basicSetEquals(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__FEATURE_ID:
				return basicSetFeatureId(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__FID:
				return basicSetFID(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__FILTER_CAPABILITIES:
				return basicSetFilterCapabilities(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__FUNCTION:
				return basicSetFunction(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__GML_OBJECT_ID:
				return basicSetGmlObjectId(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__INTERSECTS:
				return basicSetIntersects(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__LITERAL:
				return basicSetLiteral(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__LOGICAL_OPERATORS:
				return basicSetLogicalOperators(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__MUL:
				return basicSetMul(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__NOT:
				return basicSetNot(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__OR:
				return basicSetOr(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__OVERLAPS:
				return basicSetOverlaps(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN:
				return basicSetPropertyIsBetween(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO:
				return basicSetPropertyIsEqualTo(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN:
				return basicSetPropertyIsGreaterThan(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO:
				return basicSetPropertyIsGreaterThanOrEqualTo(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN:
				return basicSetPropertyIsLessThan(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO:
				return basicSetPropertyIsLessThanOrEqualTo(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LIKE:
				return basicSetPropertyIsLike(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO:
				return basicSetPropertyIsNotEqualTo(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NULL:
				return basicSetPropertyIsNull(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__SIMPLE_ARITHMETIC:
				return basicSetSimpleArithmetic(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__SORT_BY:
				return basicSetSortBy(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__SUB:
				return basicSetSub(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__TOUCHES:
				return basicSetTouches(null, msgs);
			case OGCPackage.DOCUMENT_ROOT__WITHIN:
				return basicSetWithin(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OGCPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OGCPackage.DOCUMENT_ROOT__ID:
				return getId();
			case OGCPackage.DOCUMENT_ROOT__ADD:
				return getAdd();
			case OGCPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression();
			case OGCPackage.DOCUMENT_ROOT__AND:
				return getAnd();
			case OGCPackage.DOCUMENT_ROOT__LOGIC_OPS:
				return getLogicOps();
			case OGCPackage.DOCUMENT_ROOT__BBOX:
				return getBBOX();
			case OGCPackage.DOCUMENT_ROOT__SPATIAL_OPS:
				return getSpatialOps();
			case OGCPackage.DOCUMENT_ROOT__BEYOND:
				return getBeyond();
			case OGCPackage.DOCUMENT_ROOT__COMPARISON_OPS:
				return getComparisonOps();
			case OGCPackage.DOCUMENT_ROOT__CONTAINS:
				return getContains();
			case OGCPackage.DOCUMENT_ROOT__CROSSES:
				return getCrosses();
			case OGCPackage.DOCUMENT_ROOT__DISJOINT:
				return getDisjoint();
			case OGCPackage.DOCUMENT_ROOT__DIV:
				return getDiv();
			case OGCPackage.DOCUMENT_ROOT__DWITHIN:
				return getDWithin();
			case OGCPackage.DOCUMENT_ROOT__EID:
				return getEID();
			case OGCPackage.DOCUMENT_ROOT__EQUALS:
				return getEquals();
			case OGCPackage.DOCUMENT_ROOT__FEATURE_ID:
				return getFeatureId();
			case OGCPackage.DOCUMENT_ROOT__FID:
				return getFID();
			case OGCPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case OGCPackage.DOCUMENT_ROOT__FILTER_CAPABILITIES:
				return getFilterCapabilities();
			case OGCPackage.DOCUMENT_ROOT__FUNCTION:
				return getFunction();
			case OGCPackage.DOCUMENT_ROOT__GML_OBJECT_ID:
				return getGmlObjectId();
			case OGCPackage.DOCUMENT_ROOT__INTERSECTS:
				return getIntersects();
			case OGCPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral();
			case OGCPackage.DOCUMENT_ROOT__LOGICAL_OPERATORS:
				return getLogicalOperators();
			case OGCPackage.DOCUMENT_ROOT__MUL:
				return getMul();
			case OGCPackage.DOCUMENT_ROOT__NOT:
				return getNot();
			case OGCPackage.DOCUMENT_ROOT__OR:
				return getOr();
			case OGCPackage.DOCUMENT_ROOT__OVERLAPS:
				return getOverlaps();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN:
				return getPropertyIsBetween();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO:
				return getPropertyIsEqualTo();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN:
				return getPropertyIsGreaterThan();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO:
				return getPropertyIsGreaterThanOrEqualTo();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN:
				return getPropertyIsLessThan();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO:
				return getPropertyIsLessThanOrEqualTo();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LIKE:
				return getPropertyIsLike();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO:
				return getPropertyIsNotEqualTo();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NULL:
				return getPropertyIsNull();
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName();
			case OGCPackage.DOCUMENT_ROOT__SIMPLE_ARITHMETIC:
				return getSimpleArithmetic();
			case OGCPackage.DOCUMENT_ROOT__SORT_BY:
				return getSortBy();
			case OGCPackage.DOCUMENT_ROOT__SUB:
				return getSub();
			case OGCPackage.DOCUMENT_ROOT__TOUCHES:
				return getTouches();
			case OGCPackage.DOCUMENT_ROOT__WITHIN:
				return getWithin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OGCPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__ADD:
				setAdd((BinaryOperatorType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__AND:
				setAnd((BinaryLogicOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__BBOX:
				setBBOX((BBOXType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__BEYOND:
				setBeyond((DistanceBufferType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__CONTAINS:
				setContains((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__CROSSES:
				setCrosses((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__DISJOINT:
				setDisjoint((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__DIV:
				setDiv((BinaryOperatorType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__DWITHIN:
				setDWithin((DistanceBufferType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__EID:
				setEID((EIDType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__EQUALS:
				setEquals((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__FEATURE_ID:
				setFeatureId((FeatureIdType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__FID:
				setFID((FIDType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__FILTER_CAPABILITIES:
				setFilterCapabilities((FilterCapabilitiesType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__FUNCTION:
				setFunction((FunctionType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__GML_OBJECT_ID:
				setGmlObjectId((GmlObjectIdType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__INTERSECTS:
				setIntersects((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__LOGICAL_OPERATORS:
				setLogicalOperators((LogicalOperatorsType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__MUL:
				setMul((BinaryOperatorType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__NOT:
				setNot((UnaryLogicOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__OR:
				setOr((BinaryLogicOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__OVERLAPS:
				setOverlaps((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN:
				setPropertyIsBetween((PropertyIsBetweenType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO:
				setPropertyIsEqualTo((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN:
				setPropertyIsGreaterThan((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO:
				setPropertyIsGreaterThanOrEqualTo((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN:
				setPropertyIsLessThan((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO:
				setPropertyIsLessThanOrEqualTo((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LIKE:
				setPropertyIsLike((PropertyIsLikeType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO:
				setPropertyIsNotEqualTo((BinaryComparisonOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NULL:
				setPropertyIsNull((PropertyIsNullType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((PropertyNameType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__SIMPLE_ARITHMETIC:
				setSimpleArithmetic((SimpleArithmeticType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__SORT_BY:
				setSortBy((SortByType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__SUB:
				setSub((BinaryOperatorType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__TOUCHES:
				setTouches((BinarySpatialOpType)newValue);
				return;
			case OGCPackage.DOCUMENT_ROOT__WITHIN:
				setWithin((BinarySpatialOpType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OGCPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OGCPackage.DOCUMENT_ROOT__ADD:
				setAdd((BinaryOperatorType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__AND:
				setAnd((BinaryLogicOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__BBOX:
				setBBOX((BBOXType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__BEYOND:
				setBeyond((DistanceBufferType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__CONTAINS:
				setContains((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__CROSSES:
				setCrosses((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__DISJOINT:
				setDisjoint((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__DIV:
				setDiv((BinaryOperatorType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__DWITHIN:
				setDWithin((DistanceBufferType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__EID:
				setEID((EIDType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__EQUALS:
				setEquals((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__FEATURE_ID:
				setFeatureId((FeatureIdType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__FID:
				setFID((FIDType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__FILTER_CAPABILITIES:
				setFilterCapabilities((FilterCapabilitiesType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__FUNCTION:
				setFunction((FunctionType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__GML_OBJECT_ID:
				setGmlObjectId((GmlObjectIdType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__INTERSECTS:
				setIntersects((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__LITERAL:
				setLiteral((LiteralType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__LOGICAL_OPERATORS:
				setLogicalOperators((LogicalOperatorsType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__MUL:
				setMul((BinaryOperatorType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__NOT:
				setNot((UnaryLogicOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__OR:
				setOr((BinaryLogicOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__OVERLAPS:
				setOverlaps((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN:
				setPropertyIsBetween((PropertyIsBetweenType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO:
				setPropertyIsEqualTo((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN:
				setPropertyIsGreaterThan((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO:
				setPropertyIsGreaterThanOrEqualTo((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN:
				setPropertyIsLessThan((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO:
				setPropertyIsLessThanOrEqualTo((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LIKE:
				setPropertyIsLike((PropertyIsLikeType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO:
				setPropertyIsNotEqualTo((BinaryComparisonOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NULL:
				setPropertyIsNull((PropertyIsNullType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((PropertyNameType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__SIMPLE_ARITHMETIC:
				setSimpleArithmetic((SimpleArithmeticType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__SORT_BY:
				setSortBy((SortByType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__SUB:
				setSub((BinaryOperatorType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__TOUCHES:
				setTouches((BinarySpatialOpType)null);
				return;
			case OGCPackage.DOCUMENT_ROOT__WITHIN:
				setWithin((BinarySpatialOpType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OGCPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OGCPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OGCPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OGCPackage.DOCUMENT_ROOT__ID:
				return getId() != null;
			case OGCPackage.DOCUMENT_ROOT__ADD:
				return getAdd() != null;
			case OGCPackage.DOCUMENT_ROOT__EXPRESSION:
				return getExpression() != null;
			case OGCPackage.DOCUMENT_ROOT__AND:
				return getAnd() != null;
			case OGCPackage.DOCUMENT_ROOT__LOGIC_OPS:
				return getLogicOps() != null;
			case OGCPackage.DOCUMENT_ROOT__BBOX:
				return getBBOX() != null;
			case OGCPackage.DOCUMENT_ROOT__SPATIAL_OPS:
				return getSpatialOps() != null;
			case OGCPackage.DOCUMENT_ROOT__BEYOND:
				return getBeyond() != null;
			case OGCPackage.DOCUMENT_ROOT__COMPARISON_OPS:
				return getComparisonOps() != null;
			case OGCPackage.DOCUMENT_ROOT__CONTAINS:
				return getContains() != null;
			case OGCPackage.DOCUMENT_ROOT__CROSSES:
				return getCrosses() != null;
			case OGCPackage.DOCUMENT_ROOT__DISJOINT:
				return getDisjoint() != null;
			case OGCPackage.DOCUMENT_ROOT__DIV:
				return getDiv() != null;
			case OGCPackage.DOCUMENT_ROOT__DWITHIN:
				return getDWithin() != null;
			case OGCPackage.DOCUMENT_ROOT__EID:
				return getEID() != null;
			case OGCPackage.DOCUMENT_ROOT__EQUALS:
				return getEquals() != null;
			case OGCPackage.DOCUMENT_ROOT__FEATURE_ID:
				return getFeatureId() != null;
			case OGCPackage.DOCUMENT_ROOT__FID:
				return getFID() != null;
			case OGCPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case OGCPackage.DOCUMENT_ROOT__FILTER_CAPABILITIES:
				return getFilterCapabilities() != null;
			case OGCPackage.DOCUMENT_ROOT__FUNCTION:
				return getFunction() != null;
			case OGCPackage.DOCUMENT_ROOT__GML_OBJECT_ID:
				return getGmlObjectId() != null;
			case OGCPackage.DOCUMENT_ROOT__INTERSECTS:
				return getIntersects() != null;
			case OGCPackage.DOCUMENT_ROOT__LITERAL:
				return getLiteral() != null;
			case OGCPackage.DOCUMENT_ROOT__LOGICAL_OPERATORS:
				return getLogicalOperators() != null;
			case OGCPackage.DOCUMENT_ROOT__MUL:
				return getMul() != null;
			case OGCPackage.DOCUMENT_ROOT__NOT:
				return getNot() != null;
			case OGCPackage.DOCUMENT_ROOT__OR:
				return getOr() != null;
			case OGCPackage.DOCUMENT_ROOT__OVERLAPS:
				return getOverlaps() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_BETWEEN:
				return getPropertyIsBetween() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO:
				return getPropertyIsEqualTo() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN:
				return getPropertyIsGreaterThan() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO:
				return getPropertyIsGreaterThanOrEqualTo() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN:
				return getPropertyIsLessThan() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO:
				return getPropertyIsLessThanOrEqualTo() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_LIKE:
				return getPropertyIsLike() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO:
				return getPropertyIsNotEqualTo() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_IS_NULL:
				return getPropertyIsNull() != null;
			case OGCPackage.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName() != null;
			case OGCPackage.DOCUMENT_ROOT__SIMPLE_ARITHMETIC:
				return getSimpleArithmetic() != null;
			case OGCPackage.DOCUMENT_ROOT__SORT_BY:
				return getSortBy() != null;
			case OGCPackage.DOCUMENT_ROOT__SUB:
				return getSub() != null;
			case OGCPackage.DOCUMENT_ROOT__TOUCHES:
				return getTouches() != null;
			case OGCPackage.DOCUMENT_ROOT__WITHIN:
				return getWithin() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
