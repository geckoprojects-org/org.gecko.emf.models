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
import net.opengis.kml.PolyStyleType;

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
 * An implementation of the model object '<em><b>Poly Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#getPolyStyleSimpleExtensionGroupGroup <em>Poly Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#getPolyStyleObjectExtensionGroupGroup <em>Poly Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.PolyStyleTypeImpl#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolyStyleTypeImpl extends AbstractColorStyleTypeImpl implements PolyStyleType {
	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;

	/**
	 * This is true if the Outline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outlineESet;

	/**
	 * The cached value of the '{@link #getPolyStyleSimpleExtensionGroupGroup() <em>Poly Style Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyStyleSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap polyStyleSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getPolyStyleObjectExtensionGroupGroup() <em>Poly Style Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyStyleObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap polyStyleObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolyStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getPolyStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POLY_STYLE_TYPE__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFill() {
		boolean oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.POLY_STYLE_TYPE__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		boolean oldOutlineESet = outlineESet;
		outlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.POLY_STYLE_TYPE__OUTLINE, oldOutline, outline, !oldOutlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOutline() {
		boolean oldOutline = outline;
		boolean oldOutlineESet = outlineESet;
		outline = OUTLINE_EDEFAULT;
		outlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KMLPackage.POLY_STYLE_TYPE__OUTLINE, oldOutline, OUTLINE_EDEFAULT, oldOutlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutline() {
		return outlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPolyStyleSimpleExtensionGroupGroup() {
		if (polyStyleSimpleExtensionGroupGroup == null) {
			polyStyleSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return polyStyleSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getPolyStyleSimpleExtensionGroup() {
		return getPolyStyleSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPolyStyleType_PolyStyleSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPolyStyleObjectExtensionGroupGroup() {
		if (polyStyleObjectExtensionGroupGroup == null) {
			polyStyleObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return polyStyleObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getPolyStyleObjectExtensionGroup() {
		return getPolyStyleObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getPolyStyleType_PolyStyleObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPolyStyleSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getPolyStyleObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getPolyStyleObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.POLY_STYLE_TYPE__FILL:
				return isFill();
			case KMLPackage.POLY_STYLE_TYPE__OUTLINE:
				return isOutline();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getPolyStyleSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getPolyStyleSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP:
				return getPolyStyleSimpleExtensionGroup();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getPolyStyleObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getPolyStyleObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return getPolyStyleObjectExtensionGroup();
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
			case KMLPackage.POLY_STYLE_TYPE__FILL:
				setFill((Boolean)newValue);
				return;
			case KMLPackage.POLY_STYLE_TYPE__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPolyStyleSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getPolyStyleObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.POLY_STYLE_TYPE__FILL:
				unsetFill();
				return;
			case KMLPackage.POLY_STYLE_TYPE__OUTLINE:
				unsetOutline();
				return;
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				getPolyStyleSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				getPolyStyleObjectExtensionGroupGroup().clear();
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
			case KMLPackage.POLY_STYLE_TYPE__FILL:
				return isSetFill();
			case KMLPackage.POLY_STYLE_TYPE__OUTLINE:
				return isSetOutline();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP:
				return polyStyleSimpleExtensionGroupGroup != null && !polyStyleSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP:
				return !getPolyStyleSimpleExtensionGroup().isEmpty();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP:
				return polyStyleObjectExtensionGroupGroup != null && !polyStyleObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return !getPolyStyleObjectExtensionGroup().isEmpty();
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
		result.append(" (fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", outline: ");
		if (outlineESet) result.append(outline); else result.append("<unset>");
		result.append(", polyStyleSimpleExtensionGroupGroup: ");
		result.append(polyStyleSimpleExtensionGroupGroup);
		result.append(", polyStyleObjectExtensionGroupGroup: ");
		result.append(polyStyleObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //PolyStyleTypeImpl
