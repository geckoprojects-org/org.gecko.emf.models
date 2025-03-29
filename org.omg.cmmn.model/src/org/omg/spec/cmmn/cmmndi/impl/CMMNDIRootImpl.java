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
package org.omg.spec.cmmn.cmmndi.impl;

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

import org.omg.spec.cmmn.cmmndi.CMMNDI;
import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;
import org.omg.spec.cmmn.cmmndi.CMMNDIRoot;
import org.omg.spec.cmmn.cmmndi.CMMNDiagram;
import org.omg.spec.cmmn.cmmndi.CMMNEdge;
import org.omg.spec.cmmn.cmmndi.CMMNLabel;
import org.omg.spec.cmmn.cmmndi.CMMNShape;
import org.omg.spec.cmmn.cmmndi.CMMNStyle;

import org.omg.spec.cmmn.di.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNDI <em>CMMNDI</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNDiagram <em>CMMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNDiagramElement <em>CMMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNEdge <em>CMMN Edge</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNShape <em>CMMN Shape</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIRootImpl#getCMMNStyle <em>CMMN Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNDIRootImpl extends MinimalEObjectImpl.Container implements CMMNDIRoot {
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
	protected CMMNDIRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNDIPackage.Literals.CMMNDI_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CMMNDIPackage.CMMNDI_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDI getCMMNDI() {
		return (CMMNDI)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMNDI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNDI(CMMNDI newCMMNDI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMNDI, newCMMNDI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNDI(CMMNDI newCMMNDI) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMNDI, newCMMNDI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNDiagram getCMMNDiagram() {
		return (CMMNDiagram)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNDiagram(CMMNDiagram newCMMNDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM, newCMMNDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNDiagram(CMMNDiagram newCMMNDiagram) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM, newCMMNDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramElement getCMMNDiagramElement() {
		return (DiagramElement)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNDiagramElement(DiagramElement newCMMNDiagramElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT, newCMMNDiagramElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNDiagramElement(DiagramElement newCMMNDiagramElement) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT, newCMMNDiagramElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNEdge getCMMNEdge() {
		return (CMMNEdge)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNEdge(CMMNEdge newCMMNEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_EDGE, newCMMNEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNEdge(CMMNEdge newCMMNEdge) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_EDGE, newCMMNEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNLabel getCMMNLabel() {
		return (CMMNLabel)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNLabel(CMMNLabel newCMMNLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_LABEL, newCMMNLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNLabel(CMMNLabel newCMMNLabel) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_LABEL, newCMMNLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNShape getCMMNShape() {
		return (CMMNShape)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNShape(CMMNShape newCMMNShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_SHAPE, newCMMNShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNShape(CMMNShape newCMMNShape) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_SHAPE, newCMMNShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CMMNStyle getCMMNStyle() {
		return (CMMNStyle)getMixed().get(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCMMNStyle(CMMNStyle newCMMNStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_STYLE, newCMMNStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCMMNStyle(CMMNStyle newCMMNStyle) {
		((FeatureMap.Internal)getMixed()).set(CMMNDIPackage.Literals.CMMNDI_ROOT__CMMN_STYLE, newCMMNStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNDIPackage.CMMNDI_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMNDI:
				return basicSetCMMNDI(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM:
				return basicSetCMMNDiagram(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT:
				return basicSetCMMNDiagramElement(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_EDGE:
				return basicSetCMMNEdge(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_LABEL:
				return basicSetCMMNLabel(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_SHAPE:
				return basicSetCMMNShape(null, msgs);
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_STYLE:
				return basicSetCMMNStyle(null, msgs);
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
			case CMMNDIPackage.CMMNDI_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CMMNDIPackage.CMMNDI_ROOT__CMMNDI:
				return getCMMNDI();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM:
				return getCMMNDiagram();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT:
				return getCMMNDiagramElement();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_EDGE:
				return getCMMNEdge();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_LABEL:
				return getCMMNLabel();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_SHAPE:
				return getCMMNShape();
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_STYLE:
				return getCMMNStyle();
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
			case CMMNDIPackage.CMMNDI_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMNDI:
				setCMMNDI((CMMNDI)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM:
				setCMMNDiagram((CMMNDiagram)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT:
				setCMMNDiagramElement((DiagramElement)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_EDGE:
				setCMMNEdge((CMMNEdge)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_SHAPE:
				setCMMNShape((CMMNShape)newValue);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_STYLE:
				setCMMNStyle((CMMNStyle)newValue);
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
			case CMMNDIPackage.CMMNDI_ROOT__MIXED:
				getMixed().clear();
				return;
			case CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMNDI:
				setCMMNDI((CMMNDI)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM:
				setCMMNDiagram((CMMNDiagram)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT:
				setCMMNDiagramElement((DiagramElement)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_EDGE:
				setCMMNEdge((CMMNEdge)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_LABEL:
				setCMMNLabel((CMMNLabel)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_SHAPE:
				setCMMNShape((CMMNShape)null);
				return;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_STYLE:
				setCMMNStyle((CMMNStyle)null);
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
			case CMMNDIPackage.CMMNDI_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CMMNDIPackage.CMMNDI_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CMMNDIPackage.CMMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CMMNDIPackage.CMMNDI_ROOT__CMMNDI:
				return getCMMNDI() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM:
				return getCMMNDiagram() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_DIAGRAM_ELEMENT:
				return getCMMNDiagramElement() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_EDGE:
				return getCMMNEdge() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_LABEL:
				return getCMMNLabel() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_SHAPE:
				return getCMMNShape() != null;
			case CMMNDIPackage.CMMNDI_ROOT__CMMN_STYLE:
				return getCMMNStyle() != null;
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

} //CMMNDIRootImpl
