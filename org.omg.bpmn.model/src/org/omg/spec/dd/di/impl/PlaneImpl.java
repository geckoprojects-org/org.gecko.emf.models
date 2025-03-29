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
package org.omg.spec.dd.di.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dd.di.DIPackage;
import org.omg.spec.dd.di.DiagramElement;
import org.omg.spec.dd.di.Plane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dd.di.impl.PlaneImpl#getDiagramElementGroup <em>Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dd.di.impl.PlaneImpl#getDiagramElement <em>Diagram Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlaneImpl extends NodeImpl implements Plane {
	/**
	 * The cached value of the '{@link #getDiagramElementGroup() <em>Diagram Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap diagramElementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DIPackage.Literals.PLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDiagramElementGroup() {
		if (diagramElementGroup == null) {
			diagramElementGroup = new BasicFeatureMap(this, DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP);
		}
		return diagramElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getDiagramElement() {
		return getDiagramElementGroup().list(DIPackage.Literals.PLANE__DIAGRAM_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP:
				return ((InternalEList<?>)getDiagramElementGroup()).basicRemove(otherEnd, msgs);
			case DIPackage.PLANE__DIAGRAM_ELEMENT:
				return ((InternalEList<?>)getDiagramElement()).basicRemove(otherEnd, msgs);
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
			case DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP:
				if (coreType) return getDiagramElementGroup();
				return ((FeatureMap.Internal)getDiagramElementGroup()).getWrapper();
			case DIPackage.PLANE__DIAGRAM_ELEMENT:
				return getDiagramElement();
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
			case DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP:
				((FeatureMap.Internal)getDiagramElementGroup()).set(newValue);
				return;
			case DIPackage.PLANE__DIAGRAM_ELEMENT:
				getDiagramElement().clear();
				getDiagramElement().addAll((Collection<? extends DiagramElement>)newValue);
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
			case DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP:
				getDiagramElementGroup().clear();
				return;
			case DIPackage.PLANE__DIAGRAM_ELEMENT:
				getDiagramElement().clear();
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
			case DIPackage.PLANE__DIAGRAM_ELEMENT_GROUP:
				return diagramElementGroup != null && !diagramElementGroup.isEmpty();
			case DIPackage.PLANE__DIAGRAM_ELEMENT:
				return !getDiagramElement().isEmpty();
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
		result.append(" (diagramElementGroup: ");
		result.append(diagramElementGroup);
		result.append(')');
		return result.toString();
	}

} //PlaneImpl
