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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType;

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
 * An implementation of the model object '<em><b>Nachweise BSS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getSorgerechtsnachweis <em>Sorgerechtsnachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getIdentitaetsnachweis <em>Identitaetsnachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getWeitereNachweise <em>Weitere Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getNachweisMeldebescheinigung <em>Nachweis Meldebescheinigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getAnmerkungen <em>Anmerkungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweiseBSSTypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseBSSTypeImpl extends MinimalEObjectImpl.Container implements NachweiseBSSType {
	/**
	 * The cached value of the '{@link #getSorgerechtsnachweis() <em>Sorgerechtsnachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorgerechtsnachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> sorgerechtsnachweis;

	/**
	 * The cached value of the '{@link #getIdentitaetsnachweis() <em>Identitaetsnachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitaetsnachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> identitaetsnachweis;

	/**
	 * The cached value of the '{@link #getWeitereNachweise() <em>Weitere Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> weitereNachweise;

	/**
	 * The cached value of the '{@link #getNachweisMeldebescheinigung() <em>Nachweis Meldebescheinigung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMeldebescheinigung()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMeldebescheinigung;

	/**
	 * The default value of the '{@link #getAnmerkungen() <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnmerkungen()
	 * @generated
	 * @ordered
	 */
	protected static final String ANMERKUNGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnmerkungen() <em>Anmerkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnmerkungen()
	 * @generated
	 * @ordered
	 */
	protected String anmerkungen = ANMERKUNGEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweiseBSSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.NACHWEISE_BSS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getSorgerechtsnachweis() {
		if (sorgerechtsnachweis == null) {
			sorgerechtsnachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS);
		}
		return sorgerechtsnachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getIdentitaetsnachweis() {
		if (identitaetsnachweis == null) {
			identitaetsnachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS);
		}
		return identitaetsnachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getWeitereNachweise() {
		if (weitereNachweise == null) {
			weitereNachweise = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE);
		}
		return weitereNachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMeldebescheinigung() {
		if (nachweisMeldebescheinigung == null) {
			nachweisMeldebescheinigung = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG);
		}
		return nachweisMeldebescheinigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnmerkungen() {
		return anmerkungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnmerkungen(String newAnmerkungen) {
		String oldAnmerkungen = anmerkungen;
		anmerkungen = newAnmerkungen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.NACHWEISE_BSS_TYPE__ANMERKUNGEN, oldAnmerkungen, anmerkungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS:
				return ((InternalEList<?>)getSorgerechtsnachweis()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS:
				return ((InternalEList<?>)getIdentitaetsnachweis()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE:
				return ((InternalEList<?>)getWeitereNachweise()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG:
				return ((InternalEList<?>)getNachweisMeldebescheinigung()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
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
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS:
				return getSorgerechtsnachweis();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS:
				return getIdentitaetsnachweis();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE:
				return getWeitereNachweise();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG:
				return getNachweisMeldebescheinigung();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__ANMERKUNGEN:
				return getAnmerkungen();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO:
				return getDsgvo();
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
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS:
				getSorgerechtsnachweis().clear();
				getSorgerechtsnachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS:
				getIdentitaetsnachweis().clear();
				getIdentitaetsnachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE:
				getWeitereNachweise().clear();
				getWeitereNachweise().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG:
				getNachweisMeldebescheinigung().clear();
				getNachweisMeldebescheinigung().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__ANMERKUNGEN:
				setAnmerkungen((String)newValue);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
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
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS:
				getSorgerechtsnachweis().clear();
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS:
				getIdentitaetsnachweis().clear();
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE:
				getWeitereNachweise().clear();
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG:
				getNachweisMeldebescheinigung().clear();
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__ANMERKUNGEN:
				setAnmerkungen(ANMERKUNGEN_EDEFAULT);
				return;
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
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
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__SORGERECHTSNACHWEIS:
				return sorgerechtsnachweis != null && !sorgerechtsnachweis.isEmpty();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__IDENTITAETSNACHWEIS:
				return identitaetsnachweis != null && !identitaetsnachweis.isEmpty();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__WEITERE_NACHWEISE:
				return weitereNachweise != null && !weitereNachweise.isEmpty();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__NACHWEIS_MELDEBESCHEINIGUNG:
				return nachweisMeldebescheinigung != null && !nachweisMeldebescheinigung.isEmpty();
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__ANMERKUNGEN:
				return ANMERKUNGEN_EDEFAULT == null ? anmerkungen != null : !ANMERKUNGEN_EDEFAULT.equals(anmerkungen);
			case BeistandschaftPackage.NACHWEISE_BSS_TYPE__DSGVO:
				return dsgvo != null;
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
		result.append(" (anmerkungen: ");
		result.append(anmerkungen);
		result.append(')');
		return result.toString();
	}

} //NachweiseBSSTypeImpl
