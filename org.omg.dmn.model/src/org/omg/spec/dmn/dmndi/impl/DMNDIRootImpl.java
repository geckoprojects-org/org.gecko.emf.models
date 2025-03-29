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
package org.omg.spec.dmn.dmndi.impl;

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

import org.omg.spec.dmn.di.DiagramElement;

import org.omg.spec.dmn.dmndi.DMNDI;
import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNDIRoot;
import org.omg.spec.dmn.dmndi.DMNDecisionServiceDividerLine;
import org.omg.spec.dmn.dmndi.DMNDiagram;
import org.omg.spec.dmn.dmndi.DMNEdge;
import org.omg.spec.dmn.dmndi.DMNLabel;
import org.omg.spec.dmn.dmndi.DMNShape;
import org.omg.spec.dmn.dmndi.DMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNDI <em>DMNDI</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNDiagram <em>DMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNDiagramElement <em>DMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNEdge <em>DMN Edge</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNShape <em>DMN Shape</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIRootImpl#getDMNStyle <em>DMN Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNDIRootImpl extends MinimalEObjectImpl.Container implements DMNDIRoot {
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
	protected DMNDIRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMNDI_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DMNDIPackage.DMNDI_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDecisionServiceDividerLine getDMNDecisionServiceDividerLine() {
		return (DMNDecisionServiceDividerLine)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine newDMNDecisionServiceDividerLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE, newDMNDecisionServiceDividerLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine newDMNDecisionServiceDividerLine) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE, newDMNDecisionServiceDividerLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDI getDMNDI() {
		return (DMNDI)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMNDI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDI(DMNDI newDMNDI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMNDI, newDMNDI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNDI(DMNDI newDMNDI) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMNDI, newDMNDI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDiagram getDMNDiagram() {
		return (DMNDiagram)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDiagram(DMNDiagram newDMNDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM, newDMNDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNDiagram(DMNDiagram newDMNDiagram) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM, newDMNDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramElement getDMNDiagramElement() {
		return (DiagramElement)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDiagramElement(DiagramElement newDMNDiagramElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT, newDMNDiagramElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNDiagramElement(DiagramElement newDMNDiagramElement) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT, newDMNDiagramElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNEdge getDMNEdge() {
		return (DMNEdge)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNEdge(DMNEdge newDMNEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_EDGE, newDMNEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNEdge(DMNEdge newDMNEdge) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_EDGE, newDMNEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNLabel getDMNLabel() {
		return (DMNLabel)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNLabel(DMNLabel newDMNLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_LABEL, newDMNLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNLabel(DMNLabel newDMNLabel) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_LABEL, newDMNLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNShape getDMNShape() {
		return (DMNShape)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNShape(DMNShape newDMNShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_SHAPE, newDMNShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNShape(DMNShape newDMNShape) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_SHAPE, newDMNShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNStyle getDMNStyle() {
		return (DMNStyle)getMixed().get(DMNDIPackage.Literals.DMNDI_ROOT__DMN_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNStyle(DMNStyle newDMNStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNDIPackage.Literals.DMNDI_ROOT__DMN_STYLE, newDMNStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNStyle(DMNStyle newDMNStyle) {
		((FeatureMap.Internal)getMixed()).set(DMNDIPackage.Literals.DMNDI_ROOT__DMN_STYLE, newDMNStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMNDI_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return basicSetDMNDecisionServiceDividerLine(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMNDI:
				return basicSetDMNDI(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM:
				return basicSetDMNDiagram(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT:
				return basicSetDMNDiagramElement(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_EDGE:
				return basicSetDMNEdge(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_LABEL:
				return basicSetDMNLabel(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_SHAPE:
				return basicSetDMNShape(null, msgs);
			case DMNDIPackage.DMNDI_ROOT__DMN_STYLE:
				return basicSetDMNStyle(null, msgs);
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
			case DMNDIPackage.DMNDI_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DMNDIPackage.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return getDMNDecisionServiceDividerLine();
			case DMNDIPackage.DMNDI_ROOT__DMNDI:
				return getDMNDI();
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM:
				return getDMNDiagram();
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT:
				return getDMNDiagramElement();
			case DMNDIPackage.DMNDI_ROOT__DMN_EDGE:
				return getDMNEdge();
			case DMNDIPackage.DMNDI_ROOT__DMN_LABEL:
				return getDMNLabel();
			case DMNDIPackage.DMNDI_ROOT__DMN_SHAPE:
				return getDMNShape();
			case DMNDIPackage.DMNDI_ROOT__DMN_STYLE:
				return getDMNStyle();
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
			case DMNDIPackage.DMNDI_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE:
				setDMNDecisionServiceDividerLine((DMNDecisionServiceDividerLine)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMNDI:
				setDMNDI((DMNDI)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM:
				setDMNDiagram((DMNDiagram)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT:
				setDMNDiagramElement((DiagramElement)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_EDGE:
				setDMNEdge((DMNEdge)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_LABEL:
				setDMNLabel((DMNLabel)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_SHAPE:
				setDMNShape((DMNShape)newValue);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_STYLE:
				setDMNStyle((DMNStyle)newValue);
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
			case DMNDIPackage.DMNDI_ROOT__MIXED:
				getMixed().clear();
				return;
			case DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE:
				setDMNDecisionServiceDividerLine((DMNDecisionServiceDividerLine)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMNDI:
				setDMNDI((DMNDI)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM:
				setDMNDiagram((DMNDiagram)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT:
				setDMNDiagramElement((DiagramElement)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_EDGE:
				setDMNEdge((DMNEdge)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_LABEL:
				setDMNLabel((DMNLabel)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_SHAPE:
				setDMNShape((DMNShape)null);
				return;
			case DMNDIPackage.DMNDI_ROOT__DMN_STYLE:
				setDMNStyle((DMNStyle)null);
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
			case DMNDIPackage.DMNDI_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DMNDIPackage.DMNDI_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DMNDIPackage.DMNDI_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DMNDIPackage.DMNDI_ROOT__DMN_DECISION_SERVICE_DIVIDER_LINE:
				return getDMNDecisionServiceDividerLine() != null;
			case DMNDIPackage.DMNDI_ROOT__DMNDI:
				return getDMNDI() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM:
				return getDMNDiagram() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_DIAGRAM_ELEMENT:
				return getDMNDiagramElement() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_EDGE:
				return getDMNEdge() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_LABEL:
				return getDMNLabel() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_SHAPE:
				return getDMNShape() != null;
			case DMNDIPackage.DMNDI_ROOT__DMN_STYLE:
				return getDMNStyle() != null;
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

} //DMNDIRootImpl
