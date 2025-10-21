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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einwilligungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinwilligungenTypeImpl extends MinimalEObjectImpl.Container implements EinwilligungenType {
	/**
	 * The default value of the '{@link #isEinwilligungZurAuskunftseinholung() <em>Einwilligung Zur Auskunftseinholung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZurAuskunftseinholung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinwilligungZurAuskunftseinholung() <em>Einwilligung Zur Auskunftseinholung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZurAuskunftseinholung()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZurAuskunftseinholung = EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EDEFAULT;

	/**
	 * This is true if the Einwilligung Zur Auskunftseinholung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZurAuskunftseinholungESet;

	/**
	 * The default value of the '{@link #isEinwilligungZurAuskunftseinholungEinschraenkungen() <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinwilligungZurAuskunftseinholungEinschraenkungen() <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZurAuskunftseinholungEinschraenkungen = EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN_EDEFAULT;

	/**
	 * This is true if the Einwilligung Zur Auskunftseinholung Einschraenkungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZurAuskunftseinholungEinschraenkungenESet;

	/**
	 * The default value of the '{@link #isEntbindungSchweigepflichtDerAerzte() <em>Entbindung Schweigepflicht Der Aerzte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntbindungSchweigepflichtDerAerzte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntbindungSchweigepflichtDerAerzte() <em>Entbindung Schweigepflicht Der Aerzte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntbindungSchweigepflichtDerAerzte()
	 * @generated
	 * @ordered
	 */
	protected boolean entbindungSchweigepflichtDerAerzte = ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE_EDEFAULT;

	/**
	 * This is true if the Entbindung Schweigepflicht Der Aerzte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entbindungSchweigepflichtDerAerzteESet;

	/**
	 * The default value of the '{@link #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch() <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch() <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungKostenuebernahmeregelungBehandlungsabbruch = EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH_EDEFAULT;

	/**
	 * This is true if the Einwilligung Kostenuebernahmeregelung Behandlungsabbruch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungKostenuebernahmeregelungBehandlungsabbruchESet;

	/**
	 * The default value of the '{@link #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft() <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft() <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean datenschutzerklaerungHerbeifuehrungSchwangerschaft = DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT;

	/**
	 * This is true if the Datenschutzerklaerung Herbeifuehrung Schwangerschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datenschutzerklaerungHerbeifuehrungSchwangerschaftESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinwilligungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.EINWILLIGUNGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligungZurAuskunftseinholung() {
		return einwilligungZurAuskunftseinholung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligungZurAuskunftseinholung(boolean newEinwilligungZurAuskunftseinholung) {
		boolean oldEinwilligungZurAuskunftseinholung = einwilligungZurAuskunftseinholung;
		einwilligungZurAuskunftseinholung = newEinwilligungZurAuskunftseinholung;
		boolean oldEinwilligungZurAuskunftseinholungESet = einwilligungZurAuskunftseinholungESet;
		einwilligungZurAuskunftseinholungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG, oldEinwilligungZurAuskunftseinholung, einwilligungZurAuskunftseinholung, !oldEinwilligungZurAuskunftseinholungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligungZurAuskunftseinholung() {
		boolean oldEinwilligungZurAuskunftseinholung = einwilligungZurAuskunftseinholung;
		boolean oldEinwilligungZurAuskunftseinholungESet = einwilligungZurAuskunftseinholungESet;
		einwilligungZurAuskunftseinholung = EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EDEFAULT;
		einwilligungZurAuskunftseinholungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG, oldEinwilligungZurAuskunftseinholung, EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EDEFAULT, oldEinwilligungZurAuskunftseinholungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligungZurAuskunftseinholung() {
		return einwilligungZurAuskunftseinholungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligungZurAuskunftseinholungEinschraenkungen() {
		return einwilligungZurAuskunftseinholungEinschraenkungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligungZurAuskunftseinholungEinschraenkungen(boolean newEinwilligungZurAuskunftseinholungEinschraenkungen) {
		boolean oldEinwilligungZurAuskunftseinholungEinschraenkungen = einwilligungZurAuskunftseinholungEinschraenkungen;
		einwilligungZurAuskunftseinholungEinschraenkungen = newEinwilligungZurAuskunftseinholungEinschraenkungen;
		boolean oldEinwilligungZurAuskunftseinholungEinschraenkungenESet = einwilligungZurAuskunftseinholungEinschraenkungenESet;
		einwilligungZurAuskunftseinholungEinschraenkungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN, oldEinwilligungZurAuskunftseinholungEinschraenkungen, einwilligungZurAuskunftseinholungEinschraenkungen, !oldEinwilligungZurAuskunftseinholungEinschraenkungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligungZurAuskunftseinholungEinschraenkungen() {
		boolean oldEinwilligungZurAuskunftseinholungEinschraenkungen = einwilligungZurAuskunftseinholungEinschraenkungen;
		boolean oldEinwilligungZurAuskunftseinholungEinschraenkungenESet = einwilligungZurAuskunftseinholungEinschraenkungenESet;
		einwilligungZurAuskunftseinholungEinschraenkungen = EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN_EDEFAULT;
		einwilligungZurAuskunftseinholungEinschraenkungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN, oldEinwilligungZurAuskunftseinholungEinschraenkungen, EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN_EDEFAULT, oldEinwilligungZurAuskunftseinholungEinschraenkungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligungZurAuskunftseinholungEinschraenkungen() {
		return einwilligungZurAuskunftseinholungEinschraenkungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEntbindungSchweigepflichtDerAerzte() {
		return entbindungSchweigepflichtDerAerzte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntbindungSchweigepflichtDerAerzte(boolean newEntbindungSchweigepflichtDerAerzte) {
		boolean oldEntbindungSchweigepflichtDerAerzte = entbindungSchweigepflichtDerAerzte;
		entbindungSchweigepflichtDerAerzte = newEntbindungSchweigepflichtDerAerzte;
		boolean oldEntbindungSchweigepflichtDerAerzteESet = entbindungSchweigepflichtDerAerzteESet;
		entbindungSchweigepflichtDerAerzteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE, oldEntbindungSchweigepflichtDerAerzte, entbindungSchweigepflichtDerAerzte, !oldEntbindungSchweigepflichtDerAerzteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEntbindungSchweigepflichtDerAerzte() {
		boolean oldEntbindungSchweigepflichtDerAerzte = entbindungSchweigepflichtDerAerzte;
		boolean oldEntbindungSchweigepflichtDerAerzteESet = entbindungSchweigepflichtDerAerzteESet;
		entbindungSchweigepflichtDerAerzte = ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE_EDEFAULT;
		entbindungSchweigepflichtDerAerzteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE, oldEntbindungSchweigepflichtDerAerzte, ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE_EDEFAULT, oldEntbindungSchweigepflichtDerAerzteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEntbindungSchweigepflichtDerAerzte() {
		return entbindungSchweigepflichtDerAerzteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligungKostenuebernahmeregelungBehandlungsabbruch() {
		return einwilligungKostenuebernahmeregelungBehandlungsabbruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligungKostenuebernahmeregelungBehandlungsabbruch(boolean newEinwilligungKostenuebernahmeregelungBehandlungsabbruch) {
		boolean oldEinwilligungKostenuebernahmeregelungBehandlungsabbruch = einwilligungKostenuebernahmeregelungBehandlungsabbruch;
		einwilligungKostenuebernahmeregelungBehandlungsabbruch = newEinwilligungKostenuebernahmeregelungBehandlungsabbruch;
		boolean oldEinwilligungKostenuebernahmeregelungBehandlungsabbruchESet = einwilligungKostenuebernahmeregelungBehandlungsabbruchESet;
		einwilligungKostenuebernahmeregelungBehandlungsabbruchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH, oldEinwilligungKostenuebernahmeregelungBehandlungsabbruch, einwilligungKostenuebernahmeregelungBehandlungsabbruch, !oldEinwilligungKostenuebernahmeregelungBehandlungsabbruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch() {
		boolean oldEinwilligungKostenuebernahmeregelungBehandlungsabbruch = einwilligungKostenuebernahmeregelungBehandlungsabbruch;
		boolean oldEinwilligungKostenuebernahmeregelungBehandlungsabbruchESet = einwilligungKostenuebernahmeregelungBehandlungsabbruchESet;
		einwilligungKostenuebernahmeregelungBehandlungsabbruch = EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH_EDEFAULT;
		einwilligungKostenuebernahmeregelungBehandlungsabbruchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH, oldEinwilligungKostenuebernahmeregelungBehandlungsabbruch, EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH_EDEFAULT, oldEinwilligungKostenuebernahmeregelungBehandlungsabbruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch() {
		return einwilligungKostenuebernahmeregelungBehandlungsabbruchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDatenschutzerklaerungHerbeifuehrungSchwangerschaft() {
		return datenschutzerklaerungHerbeifuehrungSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenschutzerklaerungHerbeifuehrungSchwangerschaft(boolean newDatenschutzerklaerungHerbeifuehrungSchwangerschaft) {
		boolean oldDatenschutzerklaerungHerbeifuehrungSchwangerschaft = datenschutzerklaerungHerbeifuehrungSchwangerschaft;
		datenschutzerklaerungHerbeifuehrungSchwangerschaft = newDatenschutzerklaerungHerbeifuehrungSchwangerschaft;
		boolean oldDatenschutzerklaerungHerbeifuehrungSchwangerschaftESet = datenschutzerklaerungHerbeifuehrungSchwangerschaftESet;
		datenschutzerklaerungHerbeifuehrungSchwangerschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT, oldDatenschutzerklaerungHerbeifuehrungSchwangerschaft, datenschutzerklaerungHerbeifuehrungSchwangerschaft, !oldDatenschutzerklaerungHerbeifuehrungSchwangerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft() {
		boolean oldDatenschutzerklaerungHerbeifuehrungSchwangerschaft = datenschutzerklaerungHerbeifuehrungSchwangerschaft;
		boolean oldDatenschutzerklaerungHerbeifuehrungSchwangerschaftESet = datenschutzerklaerungHerbeifuehrungSchwangerschaftESet;
		datenschutzerklaerungHerbeifuehrungSchwangerschaft = DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT;
		datenschutzerklaerungHerbeifuehrungSchwangerschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT, oldDatenschutzerklaerungHerbeifuehrungSchwangerschaft, DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT, oldDatenschutzerklaerungHerbeifuehrungSchwangerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft() {
		return datenschutzerklaerungHerbeifuehrungSchwangerschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG:
				return isEinwilligungZurAuskunftseinholung();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN:
				return isEinwilligungZurAuskunftseinholungEinschraenkungen();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE:
				return isEntbindungSchweigepflichtDerAerzte();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH:
				return isEinwilligungKostenuebernahmeregelungBehandlungsabbruch();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT:
				return isDatenschutzerklaerungHerbeifuehrungSchwangerschaft();
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
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG:
				setEinwilligungZurAuskunftseinholung((Boolean)newValue);
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN:
				setEinwilligungZurAuskunftseinholungEinschraenkungen((Boolean)newValue);
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE:
				setEntbindungSchweigepflichtDerAerzte((Boolean)newValue);
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH:
				setEinwilligungKostenuebernahmeregelungBehandlungsabbruch((Boolean)newValue);
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungHerbeifuehrungSchwangerschaft((Boolean)newValue);
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
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG:
				unsetEinwilligungZurAuskunftseinholung();
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN:
				unsetEinwilligungZurAuskunftseinholungEinschraenkungen();
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE:
				unsetEntbindungSchweigepflichtDerAerzte();
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH:
				unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch();
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT:
				unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft();
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
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG:
				return isSetEinwilligungZurAuskunftseinholung();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN:
				return isSetEinwilligungZurAuskunftseinholungEinschraenkungen();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE:
				return isSetEntbindungSchweigepflichtDerAerzte();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH:
				return isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT:
				return isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft();
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
		result.append(" (einwilligungZurAuskunftseinholung: ");
		if (einwilligungZurAuskunftseinholungESet) result.append(einwilligungZurAuskunftseinholung); else result.append("<unset>");
		result.append(", einwilligungZurAuskunftseinholungEinschraenkungen: ");
		if (einwilligungZurAuskunftseinholungEinschraenkungenESet) result.append(einwilligungZurAuskunftseinholungEinschraenkungen); else result.append("<unset>");
		result.append(", entbindungSchweigepflichtDerAerzte: ");
		if (entbindungSchweigepflichtDerAerzteESet) result.append(entbindungSchweigepflichtDerAerzte); else result.append("<unset>");
		result.append(", einwilligungKostenuebernahmeregelungBehandlungsabbruch: ");
		if (einwilligungKostenuebernahmeregelungBehandlungsabbruchESet) result.append(einwilligungKostenuebernahmeregelungBehandlungsabbruch); else result.append("<unset>");
		result.append(", datenschutzerklaerungHerbeifuehrungSchwangerschaft: ");
		if (datenschutzerklaerungHerbeifuehrungSchwangerschaftESet) result.append(datenschutzerklaerungHerbeifuehrungSchwangerschaft); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinwilligungenTypeImpl
