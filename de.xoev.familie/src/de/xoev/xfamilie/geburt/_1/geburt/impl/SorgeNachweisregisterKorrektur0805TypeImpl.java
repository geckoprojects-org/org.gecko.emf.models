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
import de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorge Nachweisregister Korrektur0805 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getAngabenZurMutterAlt <em>Angaben Zur Mutter Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getAngabenZumKindAlt <em>Angaben Zum Kind Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getEintragungNachweisregisterAlt <em>Eintragung Nachweisregister Alt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getAngabenZurMutterNeu <em>Angaben Zur Mutter Neu</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getAngabenZumKindNeu <em>Angaben Zum Kind Neu</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeNachweisregisterKorrektur0805TypeImpl#getEintragungNachweisregisterNeu <em>Eintragung Nachweisregister Neu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SorgeNachweisregisterKorrektur0805TypeImpl extends AntragsnachrichtTypeImpl implements SorgeNachweisregisterKorrektur0805Type {
	/**
	 * The cached value of the '{@link #getAngabenZurMutterAlt() <em>Angaben Zur Mutter Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurMutterAlt()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumElternteil2Type angabenZurMutterAlt;

	/**
	 * The cached value of the '{@link #getAngabenZumKindAlt() <em>Angaben Zum Kind Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKindAlt()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumKindType angabenZumKindAlt;

	/**
	 * The cached value of the '{@link #getEintragungNachweisregisterAlt() <em>Eintragung Nachweisregister Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintragungNachweisregisterAlt()
	 * @generated
	 * @ordered
	 */
	protected EintragungNachweisregisterType eintragungNachweisregisterAlt;

	/**
	 * The cached value of the '{@link #getAngabenZurMutterNeu() <em>Angaben Zur Mutter Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurMutterNeu()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumElternteil2Type angabenZurMutterNeu;

	/**
	 * The cached value of the '{@link #getAngabenZumKindNeu() <em>Angaben Zum Kind Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKindNeu()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumKindType angabenZumKindNeu;

	/**
	 * The cached value of the '{@link #getEintragungNachweisregisterNeu() <em>Eintragung Nachweisregister Neu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintragungNachweisregisterNeu()
	 * @generated
	 * @ordered
	 */
	protected EintragungNachweisregisterType eintragungNachweisregisterNeu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SorgeNachweisregisterKorrektur0805TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil2Type getAngabenZurMutterAlt() {
		return angabenZurMutterAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurMutterAlt(AngabenZumElternteil2Type newAngabenZurMutterAlt, NotificationChain msgs) {
		AngabenZumElternteil2Type oldAngabenZurMutterAlt = angabenZurMutterAlt;
		angabenZurMutterAlt = newAngabenZurMutterAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT, oldAngabenZurMutterAlt, newAngabenZurMutterAlt);
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
	public void setAngabenZurMutterAlt(AngabenZumElternteil2Type newAngabenZurMutterAlt) {
		if (newAngabenZurMutterAlt != angabenZurMutterAlt) {
			NotificationChain msgs = null;
			if (angabenZurMutterAlt != null)
				msgs = ((InternalEObject)angabenZurMutterAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT, null, msgs);
			if (newAngabenZurMutterAlt != null)
				msgs = ((InternalEObject)newAngabenZurMutterAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT, null, msgs);
			msgs = basicSetAngabenZurMutterAlt(newAngabenZurMutterAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT, newAngabenZurMutterAlt, newAngabenZurMutterAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType getAngabenZumKindAlt() {
		return angabenZumKindAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKindAlt(AngabenZumKindType newAngabenZumKindAlt, NotificationChain msgs) {
		AngabenZumKindType oldAngabenZumKindAlt = angabenZumKindAlt;
		angabenZumKindAlt = newAngabenZumKindAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT, oldAngabenZumKindAlt, newAngabenZumKindAlt);
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
	public void setAngabenZumKindAlt(AngabenZumKindType newAngabenZumKindAlt) {
		if (newAngabenZumKindAlt != angabenZumKindAlt) {
			NotificationChain msgs = null;
			if (angabenZumKindAlt != null)
				msgs = ((InternalEObject)angabenZumKindAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT, null, msgs);
			if (newAngabenZumKindAlt != null)
				msgs = ((InternalEObject)newAngabenZumKindAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT, null, msgs);
			msgs = basicSetAngabenZumKindAlt(newAngabenZumKindAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT, newAngabenZumKindAlt, newAngabenZumKindAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EintragungNachweisregisterType getEintragungNachweisregisterAlt() {
		return eintragungNachweisregisterAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEintragungNachweisregisterAlt(EintragungNachweisregisterType newEintragungNachweisregisterAlt, NotificationChain msgs) {
		EintragungNachweisregisterType oldEintragungNachweisregisterAlt = eintragungNachweisregisterAlt;
		eintragungNachweisregisterAlt = newEintragungNachweisregisterAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT, oldEintragungNachweisregisterAlt, newEintragungNachweisregisterAlt);
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
	public void setEintragungNachweisregisterAlt(EintragungNachweisregisterType newEintragungNachweisregisterAlt) {
		if (newEintragungNachweisregisterAlt != eintragungNachweisregisterAlt) {
			NotificationChain msgs = null;
			if (eintragungNachweisregisterAlt != null)
				msgs = ((InternalEObject)eintragungNachweisregisterAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT, null, msgs);
			if (newEintragungNachweisregisterAlt != null)
				msgs = ((InternalEObject)newEintragungNachweisregisterAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT, null, msgs);
			msgs = basicSetEintragungNachweisregisterAlt(newEintragungNachweisregisterAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT, newEintragungNachweisregisterAlt, newEintragungNachweisregisterAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil2Type getAngabenZurMutterNeu() {
		return angabenZurMutterNeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurMutterNeu(AngabenZumElternteil2Type newAngabenZurMutterNeu, NotificationChain msgs) {
		AngabenZumElternteil2Type oldAngabenZurMutterNeu = angabenZurMutterNeu;
		angabenZurMutterNeu = newAngabenZurMutterNeu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU, oldAngabenZurMutterNeu, newAngabenZurMutterNeu);
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
	public void setAngabenZurMutterNeu(AngabenZumElternteil2Type newAngabenZurMutterNeu) {
		if (newAngabenZurMutterNeu != angabenZurMutterNeu) {
			NotificationChain msgs = null;
			if (angabenZurMutterNeu != null)
				msgs = ((InternalEObject)angabenZurMutterNeu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU, null, msgs);
			if (newAngabenZurMutterNeu != null)
				msgs = ((InternalEObject)newAngabenZurMutterNeu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU, null, msgs);
			msgs = basicSetAngabenZurMutterNeu(newAngabenZurMutterNeu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU, newAngabenZurMutterNeu, newAngabenZurMutterNeu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType getAngabenZumKindNeu() {
		return angabenZumKindNeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKindNeu(AngabenZumKindType newAngabenZumKindNeu, NotificationChain msgs) {
		AngabenZumKindType oldAngabenZumKindNeu = angabenZumKindNeu;
		angabenZumKindNeu = newAngabenZumKindNeu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU, oldAngabenZumKindNeu, newAngabenZumKindNeu);
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
	public void setAngabenZumKindNeu(AngabenZumKindType newAngabenZumKindNeu) {
		if (newAngabenZumKindNeu != angabenZumKindNeu) {
			NotificationChain msgs = null;
			if (angabenZumKindNeu != null)
				msgs = ((InternalEObject)angabenZumKindNeu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU, null, msgs);
			if (newAngabenZumKindNeu != null)
				msgs = ((InternalEObject)newAngabenZumKindNeu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU, null, msgs);
			msgs = basicSetAngabenZumKindNeu(newAngabenZumKindNeu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU, newAngabenZumKindNeu, newAngabenZumKindNeu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EintragungNachweisregisterType getEintragungNachweisregisterNeu() {
		return eintragungNachweisregisterNeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEintragungNachweisregisterNeu(EintragungNachweisregisterType newEintragungNachweisregisterNeu, NotificationChain msgs) {
		EintragungNachweisregisterType oldEintragungNachweisregisterNeu = eintragungNachweisregisterNeu;
		eintragungNachweisregisterNeu = newEintragungNachweisregisterNeu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU, oldEintragungNachweisregisterNeu, newEintragungNachweisregisterNeu);
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
	public void setEintragungNachweisregisterNeu(EintragungNachweisregisterType newEintragungNachweisregisterNeu) {
		if (newEintragungNachweisregisterNeu != eintragungNachweisregisterNeu) {
			NotificationChain msgs = null;
			if (eintragungNachweisregisterNeu != null)
				msgs = ((InternalEObject)eintragungNachweisregisterNeu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU, null, msgs);
			if (newEintragungNachweisregisterNeu != null)
				msgs = ((InternalEObject)newEintragungNachweisregisterNeu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU, null, msgs);
			msgs = basicSetEintragungNachweisregisterNeu(newEintragungNachweisregisterNeu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU, newEintragungNachweisregisterNeu, newEintragungNachweisregisterNeu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT:
				return basicSetAngabenZurMutterAlt(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT:
				return basicSetAngabenZumKindAlt(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT:
				return basicSetEintragungNachweisregisterAlt(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU:
				return basicSetAngabenZurMutterNeu(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU:
				return basicSetAngabenZumKindNeu(null, msgs);
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU:
				return basicSetEintragungNachweisregisterNeu(null, msgs);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT:
				return getAngabenZurMutterAlt();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT:
				return getAngabenZumKindAlt();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT:
				return getEintragungNachweisregisterAlt();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU:
				return getAngabenZurMutterNeu();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU:
				return getAngabenZumKindNeu();
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU:
				return getEintragungNachweisregisterNeu();
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT:
				setAngabenZurMutterAlt((AngabenZumElternteil2Type)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT:
				setAngabenZumKindAlt((AngabenZumKindType)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT:
				setEintragungNachweisregisterAlt((EintragungNachweisregisterType)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU:
				setAngabenZurMutterNeu((AngabenZumElternteil2Type)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU:
				setAngabenZumKindNeu((AngabenZumKindType)newValue);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU:
				setEintragungNachweisregisterNeu((EintragungNachweisregisterType)newValue);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT:
				setAngabenZurMutterAlt((AngabenZumElternteil2Type)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT:
				setAngabenZumKindAlt((AngabenZumKindType)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT:
				setEintragungNachweisregisterAlt((EintragungNachweisregisterType)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU:
				setAngabenZurMutterNeu((AngabenZumElternteil2Type)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU:
				setAngabenZumKindNeu((AngabenZumKindType)null);
				return;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU:
				setEintragungNachweisregisterNeu((EintragungNachweisregisterType)null);
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
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_ALT:
				return angabenZurMutterAlt != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_ALT:
				return angabenZumKindAlt != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_ALT:
				return eintragungNachweisregisterAlt != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUR_MUTTER_NEU:
				return angabenZurMutterNeu != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__ANGABEN_ZUM_KIND_NEU:
				return angabenZumKindNeu != null;
			case GeburtPackage.SORGE_NACHWEISREGISTER_KORREKTUR0805_TYPE__EINTRAGUNG_NACHWEISREGISTER_NEU:
				return eintragungNachweisregisterNeu != null;
		}
		return super.eIsSet(featureID);
	}

} //SorgeNachweisregisterKorrektur0805TypeImpl
