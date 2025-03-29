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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dc.Dimension;

import org.omg.spec.dmn.di.DiagramElement;

import org.omg.spec.dmn.di.impl.DiagramImpl;

import org.omg.spec.dmn.dmndi.DMNDIPackage;
import org.omg.spec.dmn.dmndi.DMNDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl#getDMNDiagramElementGroup <em>DMN Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl#getDMNDiagramElement <em>DMN Diagram Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.impl.DMNDiagramImpl#isUseAlternativeInputDataShape <em>Use Alternative Input Data Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNDiagramImpl extends DiagramImpl implements DMNDiagram {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size;

	/**
	 * The cached value of the '{@link #getDMNDiagramElementGroup() <em>DMN Diagram Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNDiagramElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dMNDiagramElementGroup;

	/**
	 * The default value of the '{@link #isUseAlternativeInputDataShape() <em>Use Alternative Input Data Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAlternativeInputDataShape()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ALTERNATIVE_INPUT_DATA_SHAPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAlternativeInputDataShape() <em>Use Alternative Input Data Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAlternativeInputDataShape()
	 * @generated
	 * @ordered
	 */
	protected boolean useAlternativeInputDataShape = USE_ALTERNATIVE_INPUT_DATA_SHAPE_EDEFAULT;

	/**
	 * This is true if the Use Alternative Input Data Shape attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useAlternativeInputDataShapeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNDIPackage.Literals.DMN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_DIAGRAM__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_DIAGRAM__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNDIPackage.DMN_DIAGRAM__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_DIAGRAM__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDMNDiagramElementGroup() {
		if (dMNDiagramElementGroup == null) {
			dMNDiagramElementGroup = new BasicFeatureMap(this, DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP);
		}
		return dMNDiagramElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getDMNDiagramElement() {
		return getDMNDiagramElementGroup().list(DMNDIPackage.Literals.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAlternativeInputDataShape() {
		return useAlternativeInputDataShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAlternativeInputDataShape(boolean newUseAlternativeInputDataShape) {
		boolean oldUseAlternativeInputDataShape = useAlternativeInputDataShape;
		useAlternativeInputDataShape = newUseAlternativeInputDataShape;
		boolean oldUseAlternativeInputDataShapeESet = useAlternativeInputDataShapeESet;
		useAlternativeInputDataShapeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE, oldUseAlternativeInputDataShape, useAlternativeInputDataShape, !oldUseAlternativeInputDataShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseAlternativeInputDataShape() {
		boolean oldUseAlternativeInputDataShape = useAlternativeInputDataShape;
		boolean oldUseAlternativeInputDataShapeESet = useAlternativeInputDataShapeESet;
		useAlternativeInputDataShape = USE_ALTERNATIVE_INPUT_DATA_SHAPE_EDEFAULT;
		useAlternativeInputDataShapeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE, oldUseAlternativeInputDataShape, USE_ALTERNATIVE_INPUT_DATA_SHAPE_EDEFAULT, oldUseAlternativeInputDataShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseAlternativeInputDataShape() {
		return useAlternativeInputDataShapeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNDIPackage.DMN_DIAGRAM__SIZE:
				return basicSetSize(null, msgs);
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP:
				return ((InternalEList<?>)getDMNDiagramElementGroup()).basicRemove(otherEnd, msgs);
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT:
				return ((InternalEList<?>)getDMNDiagramElement()).basicRemove(otherEnd, msgs);
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
			case DMNDIPackage.DMN_DIAGRAM__SIZE:
				return getSize();
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP:
				if (coreType) return getDMNDiagramElementGroup();
				return ((FeatureMap.Internal)getDMNDiagramElementGroup()).getWrapper();
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT:
				return getDMNDiagramElement();
			case DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE:
				return isUseAlternativeInputDataShape();
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
			case DMNDIPackage.DMN_DIAGRAM__SIZE:
				setSize((Dimension)newValue);
				return;
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP:
				((FeatureMap.Internal)getDMNDiagramElementGroup()).set(newValue);
				return;
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT:
				getDMNDiagramElement().clear();
				getDMNDiagramElement().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE:
				setUseAlternativeInputDataShape((Boolean)newValue);
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
			case DMNDIPackage.DMN_DIAGRAM__SIZE:
				setSize((Dimension)null);
				return;
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP:
				getDMNDiagramElementGroup().clear();
				return;
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT:
				getDMNDiagramElement().clear();
				return;
			case DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE:
				unsetUseAlternativeInputDataShape();
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
			case DMNDIPackage.DMN_DIAGRAM__SIZE:
				return size != null;
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT_GROUP:
				return dMNDiagramElementGroup != null && !dMNDiagramElementGroup.isEmpty();
			case DMNDIPackage.DMN_DIAGRAM__DMN_DIAGRAM_ELEMENT:
				return !getDMNDiagramElement().isEmpty();
			case DMNDIPackage.DMN_DIAGRAM__USE_ALTERNATIVE_INPUT_DATA_SHAPE:
				return isSetUseAlternativeInputDataShape();
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
		result.append(" (dMNDiagramElementGroup: ");
		result.append(dMNDiagramElementGroup);
		result.append(", useAlternativeInputDataShape: ");
		if (useAlternativeInputDataShapeESet) result.append(useAlternativeInputDataShape); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DMNDiagramImpl
