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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AufbewahrungsdauerType;
import de.xoev.domea.domea.AussonderungsartType;
import de.xoev.domea.domea.AussonderungsmetadatenType;
import de.xoev.domea.domea.BewertungsvorschlagCodeType;
import de.xoev.domea.domea.DomeaPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aussonderungsmetadaten Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getBewertungsvorschlag <em>Bewertungsvorschlag</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getBewertungsvorschlagBegruendung <em>Bewertungsvorschlag Begruendung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getAufbewahrungsende <em>Aufbewahrungsende</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl#getTransferfristende <em>Transferfristende</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AussonderungsmetadatenTypeImpl extends MinimalEObjectImpl.Container implements AussonderungsmetadatenType {
	/**
	 * The cached value of the '{@link #getAufbewahrungsdauer() <em>Aufbewahrungsdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufbewahrungsdauer()
	 * @generated
	 * @ordered
	 */
	protected AufbewahrungsdauerType aufbewahrungsdauer;

	/**
	 * The cached value of the '{@link #getAussonderungsart() <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsart()
	 * @generated
	 * @ordered
	 */
	protected AussonderungsartType aussonderungsart;

	/**
	 * The default value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected String kennung = KENNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBewertungsvorschlag() <em>Bewertungsvorschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBewertungsvorschlag()
	 * @generated
	 * @ordered
	 */
	protected BewertungsvorschlagCodeType bewertungsvorschlag;

	/**
	 * The default value of the '{@link #getBewertungsvorschlagBegruendung() <em>Bewertungsvorschlag Begruendung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBewertungsvorschlagBegruendung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEWERTUNGSVORSCHLAG_BEGRUENDUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBewertungsvorschlagBegruendung() <em>Bewertungsvorschlag Begruendung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBewertungsvorschlagBegruendung()
	 * @generated
	 * @ordered
	 */
	protected String bewertungsvorschlagBegruendung = BEWERTUNGSVORSCHLAG_BEGRUENDUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAufbewahrungsende() <em>Aufbewahrungsende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufbewahrungsende()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AUFBEWAHRUNGSENDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAufbewahrungsende() <em>Aufbewahrungsende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufbewahrungsende()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aufbewahrungsende = AUFBEWAHRUNGSENDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferfristende() <em>Transferfristende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferfristende()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TRANSFERFRISTENDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransferfristende() <em>Transferfristende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferfristende()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar transferfristende = TRANSFERFRISTENDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AussonderungsmetadatenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AUSSONDERUNGSMETADATEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AufbewahrungsdauerType getAufbewahrungsdauer() {
		return aufbewahrungsdauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufbewahrungsdauer(AufbewahrungsdauerType newAufbewahrungsdauer, NotificationChain msgs) {
		AufbewahrungsdauerType oldAufbewahrungsdauer = aufbewahrungsdauer;
		aufbewahrungsdauer = newAufbewahrungsdauer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER, oldAufbewahrungsdauer, newAufbewahrungsdauer);
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
	public void setAufbewahrungsdauer(AufbewahrungsdauerType newAufbewahrungsdauer) {
		if (newAufbewahrungsdauer != aufbewahrungsdauer) {
			NotificationChain msgs = null;
			if (aufbewahrungsdauer != null)
				msgs = ((InternalEObject)aufbewahrungsdauer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER, null, msgs);
			if (newAufbewahrungsdauer != null)
				msgs = ((InternalEObject)newAufbewahrungsdauer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER, null, msgs);
			msgs = basicSetAufbewahrungsdauer(newAufbewahrungsdauer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER, newAufbewahrungsdauer, newAufbewahrungsdauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsartType getAussonderungsart() {
		return aussonderungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAussonderungsart(AussonderungsartType newAussonderungsart, NotificationChain msgs) {
		AussonderungsartType oldAussonderungsart = aussonderungsart;
		aussonderungsart = newAussonderungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART, oldAussonderungsart, newAussonderungsart);
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
	public void setAussonderungsart(AussonderungsartType newAussonderungsart) {
		if (newAussonderungsart != aussonderungsart) {
			NotificationChain msgs = null;
			if (aussonderungsart != null)
				msgs = ((InternalEObject)aussonderungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART, null, msgs);
			if (newAussonderungsart != null)
				msgs = ((InternalEObject)newAussonderungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART, null, msgs);
			msgs = basicSetAussonderungsart(newAussonderungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART, newAussonderungsart, newAussonderungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennung(String newKennung) {
		String oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__KENNUNG, oldKennung, kennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BewertungsvorschlagCodeType getBewertungsvorschlag() {
		return bewertungsvorschlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBewertungsvorschlag(BewertungsvorschlagCodeType newBewertungsvorschlag, NotificationChain msgs) {
		BewertungsvorschlagCodeType oldBewertungsvorschlag = bewertungsvorschlag;
		bewertungsvorschlag = newBewertungsvorschlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG, oldBewertungsvorschlag, newBewertungsvorschlag);
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
	public void setBewertungsvorschlag(BewertungsvorschlagCodeType newBewertungsvorschlag) {
		if (newBewertungsvorschlag != bewertungsvorschlag) {
			NotificationChain msgs = null;
			if (bewertungsvorschlag != null)
				msgs = ((InternalEObject)bewertungsvorschlag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG, null, msgs);
			if (newBewertungsvorschlag != null)
				msgs = ((InternalEObject)newBewertungsvorschlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG, null, msgs);
			msgs = basicSetBewertungsvorschlag(newBewertungsvorschlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG, newBewertungsvorschlag, newBewertungsvorschlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBewertungsvorschlagBegruendung() {
		return bewertungsvorschlagBegruendung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBewertungsvorschlagBegruendung(String newBewertungsvorschlagBegruendung) {
		String oldBewertungsvorschlagBegruendung = bewertungsvorschlagBegruendung;
		bewertungsvorschlagBegruendung = newBewertungsvorschlagBegruendung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG, oldBewertungsvorschlagBegruendung, bewertungsvorschlagBegruendung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAufbewahrungsende() {
		return aufbewahrungsende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAufbewahrungsende(XMLGregorianCalendar newAufbewahrungsende) {
		XMLGregorianCalendar oldAufbewahrungsende = aufbewahrungsende;
		aufbewahrungsende = newAufbewahrungsende;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE, oldAufbewahrungsende, aufbewahrungsende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTransferfristende() {
		return transferfristende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransferfristende(XMLGregorianCalendar newTransferfristende) {
		XMLGregorianCalendar oldTransferfristende = transferfristende;
		transferfristende = newTransferfristende;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE, oldTransferfristende, transferfristende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER:
				return basicSetAufbewahrungsdauer(null, msgs);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART:
				return basicSetAussonderungsart(null, msgs);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG:
				return basicSetBewertungsvorschlag(null, msgs);
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
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER:
				return getAufbewahrungsdauer();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART:
				return getAussonderungsart();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__KENNUNG:
				return getKennung();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG:
				return getBewertungsvorschlag();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG:
				return getBewertungsvorschlagBegruendung();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE:
				return getAufbewahrungsende();
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE:
				return getTransferfristende();
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
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER:
				setAufbewahrungsdauer((AufbewahrungsdauerType)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartType)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__KENNUNG:
				setKennung((String)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG:
				setBewertungsvorschlag((BewertungsvorschlagCodeType)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG:
				setBewertungsvorschlagBegruendung((String)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE:
				setAufbewahrungsende((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE:
				setTransferfristende((XMLGregorianCalendar)newValue);
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
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER:
				setAufbewahrungsdauer((AufbewahrungsdauerType)null);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartType)null);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG:
				setBewertungsvorschlag((BewertungsvorschlagCodeType)null);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG:
				setBewertungsvorschlagBegruendung(BEWERTUNGSVORSCHLAG_BEGRUENDUNG_EDEFAULT);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE:
				setAufbewahrungsende(AUFBEWAHRUNGSENDE_EDEFAULT);
				return;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE:
				setTransferfristende(TRANSFERFRISTENDE_EDEFAULT);
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
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER:
				return aufbewahrungsdauer != null;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART:
				return aussonderungsart != null;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG:
				return bewertungsvorschlag != null;
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG:
				return BEWERTUNGSVORSCHLAG_BEGRUENDUNG_EDEFAULT == null ? bewertungsvorschlagBegruendung != null : !BEWERTUNGSVORSCHLAG_BEGRUENDUNG_EDEFAULT.equals(bewertungsvorschlagBegruendung);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE:
				return AUFBEWAHRUNGSENDE_EDEFAULT == null ? aufbewahrungsende != null : !AUFBEWAHRUNGSENDE_EDEFAULT.equals(aufbewahrungsende);
			case DomeaPackage.AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE:
				return TRANSFERFRISTENDE_EDEFAULT == null ? transferfristende != null : !TRANSFERFRISTENDE_EDEFAULT.equals(transferfristende);
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
		result.append(" (kennung: ");
		result.append(kennung);
		result.append(", bewertungsvorschlagBegruendung: ");
		result.append(bewertungsvorschlagBegruendung);
		result.append(", aufbewahrungsende: ");
		result.append(aufbewahrungsende);
		result.append(", transferfristende: ");
		result.append(transferfristende);
		result.append(')');
		return result.toString();
	}

} //AussonderungsmetadatenTypeImpl
