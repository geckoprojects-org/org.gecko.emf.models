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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmndi.DMNDI;
import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNDiagram;
import org.omg.spec.dmn.dmndi.DMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMNDI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIImpl#getDMNDiagram <em>DMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDIImpl#getDMNStyle <em>DMN Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNDIImpl extends MinimalEObjectImpl.Container implements DMNDI {
	/**
	 * The cached value of the '{@link #getDMNDiagram() <em>DMN Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<DMNDiagram> dMNDiagram;

	/**
	 * The cached value of the '{@link #getDMNStyle() <em>DMN Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<DMNStyle> dMNStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNDIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMNDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DMNDiagram> getDMNDiagram() {
		if (dMNDiagram == null) {
			dMNDiagram = new EObjectContainmentEList<DMNDiagram>(DMNDiagram.class, this, DMNDIPackage.DMNDI__DMN_DIAGRAM);
		}
		return dMNDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DMNStyle> getDMNStyle() {
		if (dMNStyle == null) {
			dMNStyle = new EObjectContainmentEList<DMNStyle>(DMNStyle.class, this, DMNDIPackage.DMNDI__DMN_STYLE);
		}
		return dMNStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMNDI__DMN_DIAGRAM:
				return ((InternalEList<?>)getDMNDiagram()).basicRemove(otherEnd, msgs);
			case DMNDIPackage.DMNDI__DMN_STYLE:
				return ((InternalEList<?>)getDMNStyle()).basicRemove(otherEnd, msgs);
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
			case DMNDIPackage.DMNDI__DMN_DIAGRAM:
				return getDMNDiagram();
			case DMNDIPackage.DMNDI__DMN_STYLE:
				return getDMNStyle();
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
			case DMNDIPackage.DMNDI__DMN_DIAGRAM:
				getDMNDiagram().clear();
				getDMNDiagram().addAll((Collection<? extends DMNDiagram>)newValue);
				return;
			case DMNDIPackage.DMNDI__DMN_STYLE:
				getDMNStyle().clear();
				getDMNStyle().addAll((Collection<? extends DMNStyle>)newValue);
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
			case DMNDIPackage.DMNDI__DMN_DIAGRAM:
				getDMNDiagram().clear();
				return;
			case DMNDIPackage.DMNDI__DMN_STYLE:
				getDMNStyle().clear();
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
			case DMNDIPackage.DMNDI__DMN_DIAGRAM:
				return dMNDiagram != null && !dMNDiagram.isEmpty();
			case DMNDIPackage.DMNDI__DMN_STYLE:
				return dMNStyle != null && !dMNStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DMNDIImpl
