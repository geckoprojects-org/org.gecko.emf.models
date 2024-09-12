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
import net.opengis.kml.LineStyleType;

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
 * An implementation of the model object '<em><b>Line Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.LineStyleTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStyleTypeImpl#getLineStyleSimpleExtensionGroupGroup <em>Line Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStyleTypeImpl#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStyleTypeImpl#getLineStyleObjectExtensionGroupGroup <em>Line Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.LineStyleTypeImpl#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStyleTypeImpl extends AbstractColorStyleTypeImpl implements LineStyleType {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The cached value of the '{@link #getLineStyleSimpleExtensionGroupGroup() <em>Line Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lineStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getLineStyleObjectExtensionGroupGroup() <em>Line Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lineStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getLineStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.LINE_STYLE_TYPE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWidth() {
		double oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.LINE_STYLE_TYPE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLineStyleSimpleExtensionGroupGroup() {
		if (lineStyleSimpleExtensionGroupGroup == null) {
			lineStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return lineStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getLineStyleSimpleExtensionGroup() {
		return getLineStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLineStyleType_LineStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLineStyleObjectExtensionGroupGroup() {
		if (lineStyleObjectExtensionGroupGroup == null) {
			lineStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return lineStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getLineStyleObjectExtensionGroup() {
		return getLineStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getLineStyleType_LineStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLineStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getLineStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getLineStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.LINE_STYLE_TYPE__WIDTH:
				return getWidth();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getLineStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getLineStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP:
				return getLineStyleSimpleExtensionGroup();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getLineStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getLineStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return getLineStyleObjectExtensionGroup();
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
			case KMLPackage.LINE_STYLE_TYPE__WIDTH:
				setWidth((Double)newValue);
				return;
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLineStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getLineStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.LINE_STYLE_TYPE__WIDTH:
				unsetWidth();
				return;
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getLineStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getLineStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.LINE_STYLE_TYPE__WIDTH:
				return isSetWidth();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return lineStyleSimpleExtensionGroupGroup != null && !lineStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getLineStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return lineStyleObjectExtensionGroupGroup != null && !lineStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return !getLineStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", lineStyleSimpleExtensionGroupGroup: ");
		result.append(lineStyleSimpleExtensionGroupGroup);
		result.append(", lineStyleObjectExtensionGroupGroup: ");
		result.append(lineStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //LineStyleTypeImpl
