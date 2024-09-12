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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.DQScopeType;
import org.isotc211._2005.gmd.EXExtentPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDScopeCodePropertyType;
import org.isotc211._2005.gmd.MDScopeDescriptionPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DQ Scope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQScopeTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQScopeTypeImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DQScopeTypeImpl#getLevelDescription <em>Level Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DQScopeTypeImpl extends AbstractObjectTypeImpl implements DQScopeType {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected MDScopeCodePropertyType level;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected EXExtentPropertyType extent;

	/**
	 * The cached value of the '{@link #getLevelDescription() <em>Level Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<MDScopeDescriptionPropertyType> levelDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DQScopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDQScopeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDScopeCodePropertyType getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(MDScopeCodePropertyType newLevel, NotificationChain msgs) {
		MDScopeCodePropertyType oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_SCOPE_TYPE__LEVEL, oldLevel, newLevel);
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
	public void setLevel(MDScopeCodePropertyType newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_SCOPE_TYPE__LEVEL, null, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_SCOPE_TYPE__LEVEL, null, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_SCOPE_TYPE__LEVEL, newLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXExtentPropertyType getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(EXExtentPropertyType newExtent, NotificationChain msgs) {
		EXExtentPropertyType oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_SCOPE_TYPE__EXTENT, oldExtent, newExtent);
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
	public void setExtent(EXExtentPropertyType newExtent) {
		if (newExtent != extent) {
			NotificationChain msgs = null;
			if (extent != null)
				msgs = ((InternalEObject)extent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_SCOPE_TYPE__EXTENT, null, msgs);
			if (newExtent != null)
				msgs = ((InternalEObject)newExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DQ_SCOPE_TYPE__EXTENT, null, msgs);
			msgs = basicSetExtent(newExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DQ_SCOPE_TYPE__EXTENT, newExtent, newExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDScopeDescriptionPropertyType> getLevelDescription() {
		if (levelDescription == null) {
			levelDescription = new EObjectContainmentEList<MDScopeDescriptionPropertyType>(MDScopeDescriptionPropertyType.class, this, GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION);
		}
		return levelDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL:
				return basicSetLevel(null, msgs);
			case GMDPackage.DQ_SCOPE_TYPE__EXTENT:
				return basicSetExtent(null, msgs);
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION:
				return ((InternalEList<?>)getLevelDescription()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL:
				return getLevel();
			case GMDPackage.DQ_SCOPE_TYPE__EXTENT:
				return getExtent();
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION:
				return getLevelDescription();
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
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL:
				setLevel((MDScopeCodePropertyType)newValue);
				return;
			case GMDPackage.DQ_SCOPE_TYPE__EXTENT:
				setExtent((EXExtentPropertyType)newValue);
				return;
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION:
				getLevelDescription().clear();
				getLevelDescription().addAll((Collection<? extends MDScopeDescriptionPropertyType>)newValue);
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
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL:
				setLevel((MDScopeCodePropertyType)null);
				return;
			case GMDPackage.DQ_SCOPE_TYPE__EXTENT:
				setExtent((EXExtentPropertyType)null);
				return;
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION:
				getLevelDescription().clear();
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
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL:
				return level != null;
			case GMDPackage.DQ_SCOPE_TYPE__EXTENT:
				return extent != null;
			case GMDPackage.DQ_SCOPE_TYPE__LEVEL_DESCRIPTION:
				return levelDescription != null && !levelDescription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DQScopeTypeImpl
