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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staatsangehoerigkeiten Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaatsangehoerigkeitenNachweisbezugTypeImpl extends MinimalEObjectImpl.Container implements StaatsangehoerigkeitenNachweisbezugType {
	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeStaatsangehoerigkeitType> staatsangehoerigkeit;

	/**
	 * The cached value of the '{@link #getNachweisbezug() <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisbezug()
	 * @generated
	 * @ordered
	 */
	protected NachweisbezugType nachweisbezug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaatsangehoerigkeitenNachweisbezugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeStaatsangehoerigkeitType> getStaatsangehoerigkeit() {
		if (staatsangehoerigkeit == null) {
			staatsangehoerigkeit = new EObjectContainmentEList<CodeStaatsangehoerigkeitType>(CodeStaatsangehoerigkeitType.class, this, BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT);
		}
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisbezugType getNachweisbezug() {
		return nachweisbezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisbezug(NachweisbezugType newNachweisbezug, NotificationChain msgs) {
		NachweisbezugType oldNachweisbezug = nachweisbezug;
		nachweisbezug = newNachweisbezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, oldNachweisbezug, newNachweisbezug);
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
	public void setNachweisbezug(NachweisbezugType newNachweisbezug) {
		if (newNachweisbezug != nachweisbezug) {
			NotificationChain msgs = null;
			if (nachweisbezug != null)
				msgs = ((InternalEObject)nachweisbezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			if (newNachweisbezug != null)
				msgs = ((InternalEObject)newNachweisbezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			msgs = basicSetNachweisbezug(newNachweisbezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, newNachweisbezug, newNachweisbezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT:
				return ((InternalEList<?>)getStaatsangehoerigkeit()).basicRemove(otherEnd, msgs);
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return basicSetNachweisbezug(null, msgs);
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
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return getNachweisbezug();
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
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT:
				getStaatsangehoerigkeit().clear();
				getStaatsangehoerigkeit().addAll((Collection<? extends CodeStaatsangehoerigkeitType>)newValue);
				return;
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)newValue);
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
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT:
				getStaatsangehoerigkeit().clear();
				return;
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)null);
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
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null && !staatsangehoerigkeit.isEmpty();
			case BaukastenPackage.STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return nachweisbezug != null;
		}
		return super.eIsSet(featureID);
	}

} //StaatsangehoerigkeitenNachweisbezugTypeImpl
