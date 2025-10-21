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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateFilterType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relate Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RelateGeometryTypeImpl#getRelate <em>Relate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RelateGeometryTypeImpl#getRelateFilter <em>Relate Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelateGeometryTypeImpl extends PlacementRuleTypeImpl implements RelateGeometryType {
	/**
	 * The default value of the '{@link #getRelate() <em>Relate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelate()
	 * @generated
	 * @ordered
	 */
	protected static final RelateType RELATE_EDEFAULT = RelateType.INTERSECT;

	/**
	 * The cached value of the '{@link #getRelate() <em>Relate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelate()
	 * @generated
	 * @ordered
	 */
	protected RelateType relate = RELATE_EDEFAULT;

	/**
	 * This is true if the Relate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relateESet;

	/**
	 * The cached value of the '{@link #getRelateFilter() <em>Relate Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateFilter()
	 * @generated
	 * @ordered
	 */
	protected RelateFilterType relateFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelateGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getRelateGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateType getRelate() {
		return relate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelate(RelateType newRelate) {
		RelateType oldRelate = relate;
		relate = newRelate == null ? RELATE_EDEFAULT : newRelate;
		boolean oldRelateESet = relateESet;
		relateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_GEOMETRY_TYPE__RELATE, oldRelate, relate, !oldRelateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelate() {
		RelateType oldRelate = relate;
		boolean oldRelateESet = relateESet;
		relate = RELATE_EDEFAULT;
		relateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.RELATE_GEOMETRY_TYPE__RELATE, oldRelate, RELATE_EDEFAULT, oldRelateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelate() {
		return relateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateFilterType getRelateFilter() {
		return relateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelateFilter(RelateFilterType newRelateFilter, NotificationChain msgs) {
		RelateFilterType oldRelateFilter = relateFilter;
		relateFilter = newRelateFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER, oldRelateFilter, newRelateFilter);
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
	public void setRelateFilter(RelateFilterType newRelateFilter) {
		if (newRelateFilter != relateFilter) {
			NotificationChain msgs = null;
			if (relateFilter != null)
				msgs = ((InternalEObject)relateFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER, null, msgs);
			if (newRelateFilter != null)
				msgs = ((InternalEObject)newRelateFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER, null, msgs);
			msgs = basicSetRelateFilter(newRelateFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER, newRelateFilter, newRelateFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER:
				return basicSetRelateFilter(null, msgs);
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
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE:
				return getRelate();
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER:
				return getRelateFilter();
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
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE:
				setRelate((RelateType)newValue);
				return;
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER:
				setRelateFilter((RelateFilterType)newValue);
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
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE:
				unsetRelate();
				return;
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER:
				setRelateFilter((RelateFilterType)null);
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
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE:
				return isSetRelate();
			case AAAPackage.RELATE_GEOMETRY_TYPE__RELATE_FILTER:
				return relateFilter != null;
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
		result.append(" (relate: ");
		if (relateESet) result.append(relate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelateGeometryTypeImpl
