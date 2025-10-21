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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bewilligungsantrag1001 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschBewilligungsantrag1001TypeImpl#getBewilligungsantrag <em>Bewilligungsantrag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinderwunschBewilligungsantrag1001TypeImpl extends AntragsnachrichtTypeImpl implements KinderwunschBewilligungsantrag1001Type {
	/**
	 * The cached value of the '{@link #getBewilligungsantrag() <em>Bewilligungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBewilligungsantrag()
	 * @generated
	 * @ordered
	 */
	protected BewilligungsantragType bewilligungsantrag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KinderwunschBewilligungsantrag1001TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BewilligungsantragType getBewilligungsantrag() {
		return bewilligungsantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBewilligungsantrag(BewilligungsantragType newBewilligungsantrag, NotificationChain msgs) {
		BewilligungsantragType oldBewilligungsantrag = bewilligungsantrag;
		bewilligungsantrag = newBewilligungsantrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG, oldBewilligungsantrag, newBewilligungsantrag);
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
	public void setBewilligungsantrag(BewilligungsantragType newBewilligungsantrag) {
		if (newBewilligungsantrag != bewilligungsantrag) {
			NotificationChain msgs = null;
			if (bewilligungsantrag != null)
				msgs = ((InternalEObject)bewilligungsantrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG, null, msgs);
			if (newBewilligungsantrag != null)
				msgs = ((InternalEObject)newBewilligungsantrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG, null, msgs);
			msgs = basicSetBewilligungsantrag(newBewilligungsantrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG, newBewilligungsantrag, newBewilligungsantrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG:
				return basicSetBewilligungsantrag(null, msgs);
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
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG:
				return getBewilligungsantrag();
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
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG:
				setBewilligungsantrag((BewilligungsantragType)newValue);
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
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG:
				setBewilligungsantrag((BewilligungsantragType)null);
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
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG:
				return bewilligungsantrag != null;
		}
		return super.eIsSet(featureID);
	}

} //KinderwunschBewilligungsantrag1001TypeImpl
