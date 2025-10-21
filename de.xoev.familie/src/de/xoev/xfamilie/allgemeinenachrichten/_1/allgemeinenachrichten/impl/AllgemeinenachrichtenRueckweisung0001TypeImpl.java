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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType;

import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeinenachrichten Rueckweisung0001 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl#getRueckweisendeStelle <em>Rueckweisende Stelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl#getRueckweisungsgrund <em>Rueckweisungsgrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl#getTransportinformationen <em>Transportinformationen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.AllgemeinenachrichtenRueckweisung0001TypeImpl#getNachricht <em>Nachricht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeinenachrichtenRueckweisung0001TypeImpl extends NachrichtTypeImpl implements AllgemeinenachrichtenRueckweisung0001Type {
	/**
	 * The cached value of the '{@link #getRueckweisendeStelle() <em>Rueckweisende Stelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckweisendeStelle()
	 * @generated
	 * @ordered
	 */
	protected RueckweisendeStelleType rueckweisendeStelle;

	/**
	 * The cached value of the '{@link #getRueckweisungsgrund() <em>Rueckweisungsgrund</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckweisungsgrund()
	 * @generated
	 * @ordered
	 */
	protected EList<RueckweisungsgrundType> rueckweisungsgrund;

	/**
	 * The cached value of the '{@link #getTransportinformationen() <em>Transportinformationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportinformationen()
	 * @generated
	 * @ordered
	 */
	protected TransportinformationenType transportinformationen;

	/**
	 * The cached value of the '{@link #getIdentifikationNachricht() <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikationNachricht()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationNachrichtType identifikationNachricht;

	/**
	 * The default value of the '{@link #getNachricht() <em>Nachricht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachricht()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] NACHRICHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachricht() <em>Nachricht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachricht()
	 * @generated
	 * @ordered
	 */
	protected byte[] nachricht = NACHRICHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeinenachrichtenRueckweisung0001TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RueckweisendeStelleType getRueckweisendeStelle() {
		return rueckweisendeStelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRueckweisendeStelle(RueckweisendeStelleType newRueckweisendeStelle, NotificationChain msgs) {
		RueckweisendeStelleType oldRueckweisendeStelle = rueckweisendeStelle;
		rueckweisendeStelle = newRueckweisendeStelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE, oldRueckweisendeStelle, newRueckweisendeStelle);
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
	public void setRueckweisendeStelle(RueckweisendeStelleType newRueckweisendeStelle) {
		if (newRueckweisendeStelle != rueckweisendeStelle) {
			NotificationChain msgs = null;
			if (rueckweisendeStelle != null)
				msgs = ((InternalEObject)rueckweisendeStelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE, null, msgs);
			if (newRueckweisendeStelle != null)
				msgs = ((InternalEObject)newRueckweisendeStelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE, null, msgs);
			msgs = basicSetRueckweisendeStelle(newRueckweisendeStelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE, newRueckweisendeStelle, newRueckweisendeStelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RueckweisungsgrundType> getRueckweisungsgrund() {
		if (rueckweisungsgrund == null) {
			rueckweisungsgrund = new EObjectContainmentEList<RueckweisungsgrundType>(RueckweisungsgrundType.class, this, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND);
		}
		return rueckweisungsgrund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportinformationenType getTransportinformationen() {
		return transportinformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportinformationen(TransportinformationenType newTransportinformationen, NotificationChain msgs) {
		TransportinformationenType oldTransportinformationen = transportinformationen;
		transportinformationen = newTransportinformationen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN, oldTransportinformationen, newTransportinformationen);
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
	public void setTransportinformationen(TransportinformationenType newTransportinformationen) {
		if (newTransportinformationen != transportinformationen) {
			NotificationChain msgs = null;
			if (transportinformationen != null)
				msgs = ((InternalEObject)transportinformationen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN, null, msgs);
			if (newTransportinformationen != null)
				msgs = ((InternalEObject)newTransportinformationen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN, null, msgs);
			msgs = basicSetTransportinformationen(newTransportinformationen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN, newTransportinformationen, newTransportinformationen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType getIdentifikationNachricht() {
		return identifikationNachricht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht, NotificationChain msgs) {
		IdentifikationNachrichtType oldIdentifikationNachricht = identifikationNachricht;
		identifikationNachricht = newIdentifikationNachricht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT, oldIdentifikationNachricht, newIdentifikationNachricht);
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
	public void setIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht) {
		if (newIdentifikationNachricht != identifikationNachricht) {
			NotificationChain msgs = null;
			if (identifikationNachricht != null)
				msgs = ((InternalEObject)identifikationNachricht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			if (newIdentifikationNachricht != null)
				msgs = ((InternalEObject)newIdentifikationNachricht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT, null, msgs);
			msgs = basicSetIdentifikationNachricht(newIdentifikationNachricht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, newIdentifikationNachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getNachricht() {
		return nachricht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachricht(byte[] newNachricht) {
		byte[] oldNachricht = nachricht;
		nachricht = newNachricht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT, oldNachricht, nachricht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE:
				return basicSetRueckweisendeStelle(null, msgs);
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND:
				return ((InternalEList<?>)getRueckweisungsgrund()).basicRemove(otherEnd, msgs);
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN:
				return basicSetTransportinformationen(null, msgs);
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE:
				return getRueckweisendeStelle();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND:
				return getRueckweisungsgrund();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN:
				return getTransportinformationen();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT:
				return getNachricht();
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE:
				setRueckweisendeStelle((RueckweisendeStelleType)newValue);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND:
				getRueckweisungsgrund().clear();
				getRueckweisungsgrund().addAll((Collection<? extends RueckweisungsgrundType>)newValue);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN:
				setTransportinformationen((TransportinformationenType)newValue);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT:
				setNachricht((byte[])newValue);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE:
				setRueckweisendeStelle((RueckweisendeStelleType)null);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND:
				getRueckweisungsgrund().clear();
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN:
				setTransportinformationen((TransportinformationenType)null);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
				return;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT:
				setNachricht(NACHRICHT_EDEFAULT);
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
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISENDE_STELLE:
				return rueckweisendeStelle != null;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__RUECKWEISUNGSGRUND:
				return rueckweisungsgrund != null && !rueckweisungsgrund.isEmpty();
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__TRANSPORTINFORMATIONEN:
				return transportinformationen != null;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__IDENTIFIKATION_NACHRICHT:
				return identifikationNachricht != null;
			case AllgemeineNachrichtenPackage.ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001_TYPE__NACHRICHT:
				return NACHRICHT_EDEFAULT == null ? nachricht != null : !NACHRICHT_EDEFAULT.equals(nachricht);
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
		result.append(" (nachricht: ");
		result.append(nachricht);
		result.append(')');
		return result.toString();
	}

} //AllgemeinenachrichtenRueckweisung0001TypeImpl
