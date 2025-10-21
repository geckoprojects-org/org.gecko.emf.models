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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zur Behandlung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl#isErstantrag <em>Erstantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl#getAktenzeichenVorherigerAntrag <em>Aktenzeichen Vorheriger Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl#getVorherigeBehandlungen <em>Vorherige Behandlungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZurBehandlungTypeImpl extends MinimalEObjectImpl.Container implements AngabenZurBehandlungType {
	/**
	 * The default value of the '{@link #isErstantrag() <em>Erstantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErstantrag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERSTANTRAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isErstantrag() <em>Erstantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErstantrag()
	 * @generated
	 * @ordered
	 */
	protected boolean erstantrag = ERSTANTRAG_EDEFAULT;

	/**
	 * This is true if the Erstantrag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean erstantragESet;

	/**
	 * The default value of the '{@link #getAktenzeichenVorherigerAntrag() <em>Aktenzeichen Vorheriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenVorherigerAntrag()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_VORHERIGER_ANTRAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichenVorherigerAntrag() <em>Aktenzeichen Vorheriger Antrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenVorherigerAntrag()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichenVorherigerAntrag = AKTENZEICHEN_VORHERIGER_ANTRAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVorherigeBehandlungen() <em>Vorherige Behandlungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorherigeBehandlungen()
	 * @generated
	 * @ordered
	 */
	protected VorherigeBehandlungenType vorherigeBehandlungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZurBehandlungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.ANGABEN_ZUR_BEHANDLUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isErstantrag() {
		return erstantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErstantrag(boolean newErstantrag) {
		boolean oldErstantrag = erstantrag;
		erstantrag = newErstantrag;
		boolean oldErstantragESet = erstantragESet;
		erstantragESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG, oldErstantrag, erstantrag, !oldErstantragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetErstantrag() {
		boolean oldErstantrag = erstantrag;
		boolean oldErstantragESet = erstantragESet;
		erstantrag = ERSTANTRAG_EDEFAULT;
		erstantragESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG, oldErstantrag, ERSTANTRAG_EDEFAULT, oldErstantragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetErstantrag() {
		return erstantragESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichenVorherigerAntrag() {
		return aktenzeichenVorherigerAntrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichenVorherigerAntrag(String newAktenzeichenVorherigerAntrag) {
		String oldAktenzeichenVorherigerAntrag = aktenzeichenVorherigerAntrag;
		aktenzeichenVorherigerAntrag = newAktenzeichenVorherigerAntrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG, oldAktenzeichenVorherigerAntrag, aktenzeichenVorherigerAntrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VorherigeBehandlungenType getVorherigeBehandlungen() {
		return vorherigeBehandlungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorherigeBehandlungen(VorherigeBehandlungenType newVorherigeBehandlungen, NotificationChain msgs) {
		VorherigeBehandlungenType oldVorherigeBehandlungen = vorherigeBehandlungen;
		vorherigeBehandlungen = newVorherigeBehandlungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN, oldVorherigeBehandlungen, newVorherigeBehandlungen);
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
	public void setVorherigeBehandlungen(VorherigeBehandlungenType newVorherigeBehandlungen) {
		if (newVorherigeBehandlungen != vorherigeBehandlungen) {
			NotificationChain msgs = null;
			if (vorherigeBehandlungen != null)
				msgs = ((InternalEObject)vorherigeBehandlungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN, null, msgs);
			if (newVorherigeBehandlungen != null)
				msgs = ((InternalEObject)newVorherigeBehandlungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN, null, msgs);
			msgs = basicSetVorherigeBehandlungen(newVorherigeBehandlungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN, newVorherigeBehandlungen, newVorherigeBehandlungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN:
				return basicSetVorherigeBehandlungen(null, msgs);
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
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG:
				return isErstantrag();
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG:
				return getAktenzeichenVorherigerAntrag();
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN:
				return getVorherigeBehandlungen();
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
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG:
				setErstantrag((Boolean)newValue);
				return;
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG:
				setAktenzeichenVorherigerAntrag((String)newValue);
				return;
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN:
				setVorherigeBehandlungen((VorherigeBehandlungenType)newValue);
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
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG:
				unsetErstantrag();
				return;
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG:
				setAktenzeichenVorherigerAntrag(AKTENZEICHEN_VORHERIGER_ANTRAG_EDEFAULT);
				return;
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN:
				setVorherigeBehandlungen((VorherigeBehandlungenType)null);
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
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG:
				return isSetErstantrag();
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG:
				return AKTENZEICHEN_VORHERIGER_ANTRAG_EDEFAULT == null ? aktenzeichenVorherigerAntrag != null : !AKTENZEICHEN_VORHERIGER_ANTRAG_EDEFAULT.equals(aktenzeichenVorherigerAntrag);
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN:
				return vorherigeBehandlungen != null;
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
		result.append(" (erstantrag: ");
		if (erstantragESet) result.append(erstantrag); else result.append("<unset>");
		result.append(", aktenzeichenVorherigerAntrag: ");
		result.append(aktenzeichenVorherigerAntrag);
		result.append(')');
		return result.toString();
	}

} //AngabenZurBehandlungTypeImpl
