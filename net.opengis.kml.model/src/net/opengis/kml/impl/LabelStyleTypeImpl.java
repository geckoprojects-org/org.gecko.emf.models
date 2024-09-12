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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.LabelStyleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LabelStyleTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LabelStyleTypeImpl#getLabelStyleSimpleExtensionGroupGroup <em>Label Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LabelStyleTypeImpl#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LabelStyleTypeImpl#getLabelStyleObjectExtensionGroupGroup <em>Label Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LabelStyleTypeImpl#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelStyleTypeImpl extends AbstractColorStyleTypeImpl implements LabelStyleType {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The cached value of the '{@link #getLabelStyleSimpleExtensionGroupGroup() <em>Label Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap labelStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLabelStyleObjectExtensionGroupGroup() <em>Label Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap labelStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLabelStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LABEL_STYLE_TYPE__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScale() {
		double oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LABEL_STYLE_TYPE__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLabelStyleSimpleExtensionGroupGroup() {
		if (labelStyleSimpleExtensionGroupGroup == null) {
			labelStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return labelStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLabelStyleSimpleExtensionGroup() {
		return getLabelStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLabelStyleType_LabelStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLabelStyleObjectExtensionGroupGroup() {
		if (labelStyleObjectExtensionGroupGroup == null) {
			labelStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return labelStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLabelStyleObjectExtensionGroup() {
		return getLabelStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLabelStyleType_LabelStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLabelStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLabelStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLabelStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LABEL_STYLE_TYPE__SCALE:
				return getScale();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLabelStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLabelStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP:
				return getLabelStyleSimpleExtensionGroup();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLabelStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLabelStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return getLabelStyleObjectExtensionGroup();
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
			case KMLPackage.LABEL_STYLE_TYPE__SCALE:
				setScale((Double)newValue);
				return;
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLabelStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLabelStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LABEL_STYLE_TYPE__SCALE:
				unsetScale();
				return;
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getLabelStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getLabelStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LABEL_STYLE_TYPE__SCALE:
				return isSetScale();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return labelStyleSimpleExtensionGroupGroup != null && !labelStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getLabelStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return labelStyleObjectExtensionGroupGroup != null && !labelStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return !getLabelStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", labelStyleSimpleExtensionGroupGroup: ");
		result.append(labelStyleSimpleExtensionGroupGroup);
		result.append(", labelStyleObjectExtensionGroupGroup: ");
		result.append(labelStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LabelStyleTypeImpl
