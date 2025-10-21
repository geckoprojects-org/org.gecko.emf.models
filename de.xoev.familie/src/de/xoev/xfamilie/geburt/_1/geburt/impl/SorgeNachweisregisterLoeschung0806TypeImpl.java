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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorge Nachweisregister Loeschung0806 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterLoeschung0806TypeImpl#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SorgeNachweisregisterLoeschung0806TypeImpl extends AntragsnachrichtTypeImpl implements SorgeNachweisregisterLoeschung0806Type {
	/**
	 * The cached value of the '{@link #getAngabenZurMutter() <em>Angaben Zur Mutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurMutter()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumElternteil2Type angabenZurMutter;

	/**
	 * The cached value of the '{@link #getAngabenZumKind() <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKind()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumKindType angabenZumKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SorgeNachweisregisterLoeschung0806TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil2Type getAngabenZurMutter() {
		return angabenZurMutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurMutter(AngabenZumElternteil2Type newAngabenZurMutter, NotificationChain msgs) {
		AngabenZumElternteil2Type oldAngabenZurMutter = angabenZurMutter;
		angabenZurMutter = newAngabenZurMutter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER, oldAngabenZurMutter, newAngabenZurMutter);
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
	public void setAngabenZurMutter(AngabenZumElternteil2Type newAngabenZurMutter) {
		if (newAngabenZurMutter != angabenZurMutter) {
			NotificationChain msgs = null;
			if (angabenZurMutter != null)
				msgs = ((InternalEObject)angabenZurMutter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER, null, msgs);
			if (newAngabenZurMutter != null)
				msgs = ((InternalEObject)newAngabenZurMutter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER, null, msgs);
			msgs = basicSetAngabenZurMutter(newAngabenZurMutter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER, newAngabenZurMutter, newAngabenZurMutter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType getAngabenZumKind() {
		return angabenZumKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKind(AngabenZumKindType newAngabenZumKind, NotificationChain msgs) {
		AngabenZumKindType oldAngabenZumKind = angabenZumKind;
		angabenZumKind = newAngabenZumKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND, oldAngabenZumKind, newAngabenZumKind);
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
	public void setAngabenZumKind(AngabenZumKindType newAngabenZumKind) {
		if (newAngabenZumKind != angabenZumKind) {
			NotificationChain msgs = null;
			if (angabenZumKind != null)
				msgs = ((InternalEObject)angabenZumKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			if (newAngabenZumKind != null)
				msgs = ((InternalEObject)newAngabenZumKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			msgs = basicSetAngabenZumKind(newAngabenZumKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND, newAngabenZumKind, newAngabenZumKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER:
				return basicSetAngabenZurMutter(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND:
				return basicSetAngabenZumKind(null, msgs);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER:
				return getAngabenZurMutter();
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND:
				return getAngabenZumKind();
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER:
				setAngabenZurMutter((AngabenZumElternteil2Type)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)newValue);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER:
				setAngabenZurMutter((AngabenZumElternteil2Type)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)null);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUR_MUTTER:
				return angabenZurMutter != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_LOESCHUNG0806_TYPE__ANGABEN_ZUM_KIND:
				return angabenZumKind != null;
		}
		return super.eIsSet(featureID);
	}

} //SorgeNachweisregisterLoeschung0806TypeImpl
