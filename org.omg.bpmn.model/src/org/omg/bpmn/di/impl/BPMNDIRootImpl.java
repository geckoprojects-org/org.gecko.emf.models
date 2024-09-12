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
package org.omg.bpmn.di.impl;

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

import org.omg.bpmn.di.BPMNDIRoot;
import org.omg.bpmn.di.BPMNDiagram;
import org.omg.bpmn.di.BPMNEdge;
import org.omg.bpmn.di.BPMNLabel;
import org.omg.bpmn.di.BPMNLabelStyle;
import org.omg.bpmn.di.BPMNPlane;
import org.omg.bpmn.di.BPMNShape;
import org.omg.bpmn.di.BpmnDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMNDI Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNDiagram <em>BPMN Diagram</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNEdge <em>BPMN Edge</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNLabel <em>BPMN Label</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNLabelStyle <em>BPMN Label Style</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNPlane <em>BPMN Plane</em>}</li>
 *   <li>{@link org.omg.bpmn.di.impl.BPMNDIRootImpl#getBPMNShape <em>BPMN Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNDIRootImpl extends MinimalEObjectImpl.Container implements BPMNDIRoot {
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
	protected BPMNDIRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.BPMNDI_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BpmnDiPackage.BPMNDI_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNDiagram getBPMNDiagram() {
		return (BPMNDiagram)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNDiagram(BPMNDiagram newBPMNDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_DIAGRAM, newBPMNDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNDiagram(BPMNDiagram newBPMNDiagram) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_DIAGRAM, newBPMNDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNEdge getBPMNEdge() {
		return (BPMNEdge)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNEdge(BPMNEdge newBPMNEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_EDGE, newBPMNEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNEdge(BPMNEdge newBPMNEdge) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_EDGE, newBPMNEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabel getBPMNLabel() {
		return (BPMNLabel)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNLabel(BPMNLabel newBPMNLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL, newBPMNLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNLabel(BPMNLabel newBPMNLabel) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL, newBPMNLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNLabelStyle getBPMNLabelStyle() {
		return (BPMNLabelStyle)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNLabelStyle(BPMNLabelStyle newBPMNLabelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL_STYLE, newBPMNLabelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNLabelStyle(BPMNLabelStyle newBPMNLabelStyle) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_LABEL_STYLE, newBPMNLabelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNPlane getBPMNPlane() {
		return (BPMNPlane)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_PLANE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNPlane(BPMNPlane newBPMNPlane, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_PLANE, newBPMNPlane, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNPlane(BPMNPlane newBPMNPlane) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_PLANE, newBPMNPlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNShape getBPMNShape() {
		return (BPMNShape)getMixed().get(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNShape(BPMNShape newBPMNShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_SHAPE, newBPMNShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBPMNShape(BPMNShape newBPMNShape) {
		((FeatureMap.Internal)getMixed()).set(BpmnDiPackage.Literals.BPMNDI_ROOT__BPMN_SHAPE, newBPMNShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnDiPackage.BPMNDI_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_DIAGRAM:
				return basicSetBPMNDiagram(null, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_EDGE:
				return basicSetBPMNEdge(null, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL:
				return basicSetBPMNLabel(null, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL_STYLE:
				return basicSetBPMNLabelStyle(null, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_PLANE:
				return basicSetBPMNPlane(null, msgs);
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_SHAPE:
				return basicSetBPMNShape(null, msgs);
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
			case BpmnDiPackage.BPMNDI_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_DIAGRAM:
				return getBPMNDiagram();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_EDGE:
				return getBPMNEdge();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL:
				return getBPMNLabel();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL_STYLE:
				return getBPMNLabelStyle();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_PLANE:
				return getBPMNPlane();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_SHAPE:
				return getBPMNShape();
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
			case BpmnDiPackage.BPMNDI_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_DIAGRAM:
				setBPMNDiagram((BPMNDiagram)newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_EDGE:
				setBPMNEdge((BPMNEdge)newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL:
				setBPMNLabel((BPMNLabel)newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL_STYLE:
				setBPMNLabelStyle((BPMNLabelStyle)newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_PLANE:
				setBPMNPlane((BPMNPlane)newValue);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_SHAPE:
				setBPMNShape((BPMNShape)newValue);
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
			case BpmnDiPackage.BPMNDI_ROOT__MIXED:
				getMixed().clear();
				return;
			case BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_DIAGRAM:
				setBPMNDiagram((BPMNDiagram)null);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_EDGE:
				setBPMNEdge((BPMNEdge)null);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL:
				setBPMNLabel((BPMNLabel)null);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL_STYLE:
				setBPMNLabelStyle((BPMNLabelStyle)null);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_PLANE:
				setBPMNPlane((BPMNPlane)null);
				return;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_SHAPE:
				setBPMNShape((BPMNShape)null);
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
			case BpmnDiPackage.BPMNDI_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BpmnDiPackage.BPMNDI_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BpmnDiPackage.BPMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_DIAGRAM:
				return getBPMNDiagram() != null;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_EDGE:
				return getBPMNEdge() != null;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL:
				return getBPMNLabel() != null;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_LABEL_STYLE:
				return getBPMNLabelStyle() != null;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_PLANE:
				return getBPMNPlane() != null;
			case BpmnDiPackage.BPMNDI_ROOT__BPMN_SHAPE:
				return getBPMNShape() != null;
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

} //BPMNDIRootImpl
