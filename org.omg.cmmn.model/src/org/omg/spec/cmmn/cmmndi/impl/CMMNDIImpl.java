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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.cmmndi.CMMNDI;
import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;
import org.omg.spec.cmmn.cmmndi.CMMNDiagram;
import org.omg.spec.cmmn.cmmndi.CMMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMNDI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl#getCMMNDiagram <em>CMMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.impl.CMMNDIImpl#getCMMNStyle <em>CMMN Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMMNDIImpl extends MinimalEObjectImpl.Container implements CMMNDI {
	/**
	 * The cached value of the '{@link #getCMMNDiagram() <em>CMMN Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMMNDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<CMMNDiagram> cMMNDiagram;

	/**
	 * The cached value of the '{@link #getCMMNStyle() <em>CMMN Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMMNStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<CMMNStyle> cMMNStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNDIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNDIPackage.Literals.CMMNDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CMMNDiagram> getCMMNDiagram() {
		if (cMMNDiagram == null) {
			cMMNDiagram = new EObjectContainmentEList<CMMNDiagram>(CMMNDiagram.class, this, CMMNDIPackage.CMMNDI__CMMN_DIAGRAM);
		}
		return cMMNDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CMMNStyle> getCMMNStyle() {
		if (cMMNStyle == null) {
			cMMNStyle = new EObjectContainmentEList<CMMNStyle>(CMMNStyle.class, this, CMMNDIPackage.CMMNDI__CMMN_STYLE);
		}
		return cMMNStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNDIPackage.CMMNDI__CMMN_DIAGRAM:
				return ((InternalEList<?>)getCMMNDiagram()).basicRemove(otherEnd, msgs);
			case CMMNDIPackage.CMMNDI__CMMN_STYLE:
				return ((InternalEList<?>)getCMMNStyle()).basicRemove(otherEnd, msgs);
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
			case CMMNDIPackage.CMMNDI__CMMN_DIAGRAM:
				return getCMMNDiagram();
			case CMMNDIPackage.CMMNDI__CMMN_STYLE:
				return getCMMNStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CMMNDIPackage.CMMNDI__CMMN_DIAGRAM:
				getCMMNDiagram().clear();
				getCMMNDiagram().addAll((Collection<? extends CMMNDiagram>)newValue);
				return;
			case CMMNDIPackage.CMMNDI__CMMN_STYLE:
				getCMMNStyle().clear();
				getCMMNStyle().addAll((Collection<? extends CMMNStyle>)newValue);
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
			case CMMNDIPackage.CMMNDI__CMMN_DIAGRAM:
				getCMMNDiagram().clear();
				return;
			case CMMNDIPackage.CMMNDI__CMMN_STYLE:
				getCMMNStyle().clear();
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
			case CMMNDIPackage.CMMNDI__CMMN_DIAGRAM:
				return cMMNDiagram != null && !cMMNDiagram.isEmpty();
			case CMMNDIPackage.CMMNDI__CMMN_STYLE:
				return cMMNStyle != null && !cMMNStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CMMNDIImpl
