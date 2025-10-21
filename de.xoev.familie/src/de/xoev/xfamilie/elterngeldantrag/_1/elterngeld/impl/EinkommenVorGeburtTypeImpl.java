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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigeBeschaeftigungVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType;

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
 * An implementation of the model object '<em><b>Einkommen Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getNichtselbststaendigeBeschaeftigung <em>Nichtselbststaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isEinkommenAusNichtselbststaendigerTaetigkeit <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isSelbstaendigeBeschaeftigung <em>Selbstaendige Beschaeftigung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getEntgeltdatenDsrv <em>Entgeltdaten Dsrv</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isGewerbebetrieb <em>Gewerbebetrieb</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isLandUndForstwirtschaft <em>Land Und Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getNachweisMutter <em>Nachweis Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getSelbststaendigkeitGewerbeLandForstwirtschaft <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommenVorGeburtTypeImpl#getEinkommensersatzleistungen <em>Einkommensersatzleistungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommenVorGeburtTypeImpl extends MinimalEObjectImpl.Container implements EinkommenVorGeburtType {
	/**
	 * The cached value of the '{@link #getNichtselbststaendigeBeschaeftigung() <em>Nichtselbststaendige Beschaeftigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtselbststaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected NichtselbststaendigeBeschaeftigungVorGeburtType nichtselbststaendigeBeschaeftigung;

	/**
	 * The default value of the '{@link #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() <em>Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig()
	 * @generated
	 * @ordered
	 */
	protected boolean beruecksichtigungAusschliesslichEinkommenNichtselbststaendig = BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG_EDEFAULT;

	/**
	 * This is true if the Beruecksichtigung Ausschliesslich Einkommen Nichtselbststaendig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet;

	/**
	 * The default value of the '{@link #isEinkommenAusNichtselbststaendigerTaetigkeit() <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommenAusNichtselbststaendigerTaetigkeit() <em>Einkommen Aus Nichtselbststaendiger Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommenAusNichtselbststaendigerTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommenAusNichtselbststaendigerTaetigkeit = EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT;

	/**
	 * This is true if the Einkommen Aus Nichtselbststaendiger Taetigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommenAusNichtselbststaendigerTaetigkeitESet;

	/**
	 * The default value of the '{@link #isSelbstaendigeBeschaeftigung() <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelbstaendigeBeschaeftigung() <em>Selbstaendige Beschaeftigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelbstaendigeBeschaeftigung()
	 * @generated
	 * @ordered
	 */
	protected boolean selbstaendigeBeschaeftigung = SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT;

	/**
	 * This is true if the Selbstaendige Beschaeftigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selbstaendigeBeschaeftigungESet;

	/**
	 * The cached value of the '{@link #getGeringesEinkommenCovid19() <em>Geringes Einkommen Covid19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeringesEinkommenCovid19()
	 * @generated
	 * @ordered
	 */
	protected GeringesEinkommenCovid19Type geringesEinkommenCovid19;

	/**
	 * The cached value of the '{@link #getEntgeltdatenDsrv() <em>Entgeltdaten Dsrv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntgeltdatenDsrv()
	 * @generated
	 * @ordered
	 */
	protected EntgeltdatenDsrvNachweisbezugType entgeltdatenDsrv;

	/**
	 * The default value of the '{@link #isGewerbebetrieb() <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGewerbebetrieb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEWERBEBETRIEB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGewerbebetrieb() <em>Gewerbebetrieb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGewerbebetrieb()
	 * @generated
	 * @ordered
	 */
	protected boolean gewerbebetrieb = GEWERBEBETRIEB_EDEFAULT;

	/**
	 * This is true if the Gewerbebetrieb attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gewerbebetriebESet;

	/**
	 * The default value of the '{@link #isLandUndForstwirtschaft() <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandUndForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAND_UND_FORSTWIRTSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLandUndForstwirtschaft() <em>Land Und Forstwirtschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLandUndForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean landUndForstwirtschaft = LAND_UND_FORSTWIRTSCHAFT_EDEFAULT;

	/**
	 * This is true if the Land Und Forstwirtschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean landUndForstwirtschaftESet;

	/**
	 * The default value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREIWILLIGENDIENST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;

	/**
	 * This is true if the Freiwilligendienst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienstESet;

	/**
	 * The cached value of the '{@link #getNachweisMutter() <em>Nachweis Mutter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMutter()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMutter;

	/**
	 * The cached value of the '{@link #getSelbststaendigkeitGewerbeLandForstwirtschaft() <em>Selbststaendigkeit Gewerbe Land Forstwirtschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelbststaendigkeitGewerbeLandForstwirtschaft()
	 * @generated
	 * @ordered
	 */
	protected SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType selbststaendigkeitGewerbeLandForstwirtschaft;

	/**
	 * The cached value of the '{@link #getEinkommensersatzleistungen() <em>Einkommensersatzleistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensersatzleistungen()
	 * @generated
	 * @ordered
	 */
	protected EinkommensersatzleistungenVorGeburtType einkommensersatzleistungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommenVorGeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkommenVorGeburtType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NichtselbststaendigeBeschaeftigungVorGeburtType getNichtselbststaendigeBeschaeftigung() {
		return nichtselbststaendigeBeschaeftigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNichtselbststaendigeBeschaeftigung(NichtselbststaendigeBeschaeftigungVorGeburtType newNichtselbststaendigeBeschaeftigung, NotificationChain msgs) {
		NichtselbststaendigeBeschaeftigungVorGeburtType oldNichtselbststaendigeBeschaeftigung = nichtselbststaendigeBeschaeftigung;
		nichtselbststaendigeBeschaeftigung = newNichtselbststaendigeBeschaeftigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG, oldNichtselbststaendigeBeschaeftigung, newNichtselbststaendigeBeschaeftigung);
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
	public void setNichtselbststaendigeBeschaeftigung(NichtselbststaendigeBeschaeftigungVorGeburtType newNichtselbststaendigeBeschaeftigung) {
		if (newNichtselbststaendigeBeschaeftigung != nichtselbststaendigeBeschaeftigung) {
			NotificationChain msgs = null;
			if (nichtselbststaendigeBeschaeftigung != null)
				msgs = ((InternalEObject)nichtselbststaendigeBeschaeftigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG, null, msgs);
			if (newNichtselbststaendigeBeschaeftigung != null)
				msgs = ((InternalEObject)newNichtselbststaendigeBeschaeftigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG, null, msgs);
			msgs = basicSetNichtselbststaendigeBeschaeftigung(newNichtselbststaendigeBeschaeftigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG, newNichtselbststaendigeBeschaeftigung, newNichtselbststaendigeBeschaeftigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() {
		return beruecksichtigungAusschliesslichEinkommenNichtselbststaendig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig(boolean newBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig) {
		boolean oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig = beruecksichtigungAusschliesslichEinkommenNichtselbststaendig;
		beruecksichtigungAusschliesslichEinkommenNichtselbststaendig = newBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig;
		boolean oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet = beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet;
		beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG, oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig, beruecksichtigungAusschliesslichEinkommenNichtselbststaendig, !oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() {
		boolean oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig = beruecksichtigungAusschliesslichEinkommenNichtselbststaendig;
		boolean oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet = beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet;
		beruecksichtigungAusschliesslichEinkommenNichtselbststaendig = BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG_EDEFAULT;
		beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG, oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig, BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG_EDEFAULT, oldBeruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig() {
		return beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommenAusNichtselbststaendigerTaetigkeit() {
		return einkommenAusNichtselbststaendigerTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommenAusNichtselbststaendigerTaetigkeit(boolean newEinkommenAusNichtselbststaendigerTaetigkeit) {
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeit = einkommenAusNichtselbststaendigerTaetigkeit;
		einkommenAusNichtselbststaendigerTaetigkeit = newEinkommenAusNichtselbststaendigerTaetigkeit;
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeitESet = einkommenAusNichtselbststaendigerTaetigkeitESet;
		einkommenAusNichtselbststaendigerTaetigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT, oldEinkommenAusNichtselbststaendigerTaetigkeit, einkommenAusNichtselbststaendigerTaetigkeit, !oldEinkommenAusNichtselbststaendigerTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommenAusNichtselbststaendigerTaetigkeit() {
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeit = einkommenAusNichtselbststaendigerTaetigkeit;
		boolean oldEinkommenAusNichtselbststaendigerTaetigkeitESet = einkommenAusNichtselbststaendigerTaetigkeitESet;
		einkommenAusNichtselbststaendigerTaetigkeit = EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT;
		einkommenAusNichtselbststaendigerTaetigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT, oldEinkommenAusNichtselbststaendigerTaetigkeit, EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT_EDEFAULT, oldEinkommenAusNichtselbststaendigerTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommenAusNichtselbststaendigerTaetigkeit() {
		return einkommenAusNichtselbststaendigerTaetigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelbstaendigeBeschaeftigung() {
		return selbstaendigeBeschaeftigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelbstaendigeBeschaeftigung(boolean newSelbstaendigeBeschaeftigung) {
		boolean oldSelbstaendigeBeschaeftigung = selbstaendigeBeschaeftigung;
		selbstaendigeBeschaeftigung = newSelbstaendigeBeschaeftigung;
		boolean oldSelbstaendigeBeschaeftigungESet = selbstaendigeBeschaeftigungESet;
		selbstaendigeBeschaeftigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG, oldSelbstaendigeBeschaeftigung, selbstaendigeBeschaeftigung, !oldSelbstaendigeBeschaeftigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSelbstaendigeBeschaeftigung() {
		boolean oldSelbstaendigeBeschaeftigung = selbstaendigeBeschaeftigung;
		boolean oldSelbstaendigeBeschaeftigungESet = selbstaendigeBeschaeftigungESet;
		selbstaendigeBeschaeftigung = SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT;
		selbstaendigeBeschaeftigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG, oldSelbstaendigeBeschaeftigung, SELBSTAENDIGE_BESCHAEFTIGUNG_EDEFAULT, oldSelbstaendigeBeschaeftigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSelbstaendigeBeschaeftigung() {
		return selbstaendigeBeschaeftigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeringesEinkommenCovid19Type getGeringesEinkommenCovid19() {
		return geringesEinkommenCovid19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeringesEinkommenCovid19(GeringesEinkommenCovid19Type newGeringesEinkommenCovid19, NotificationChain msgs) {
		GeringesEinkommenCovid19Type oldGeringesEinkommenCovid19 = geringesEinkommenCovid19;
		geringesEinkommenCovid19 = newGeringesEinkommenCovid19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19, oldGeringesEinkommenCovid19, newGeringesEinkommenCovid19);
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
	public void setGeringesEinkommenCovid19(GeringesEinkommenCovid19Type newGeringesEinkommenCovid19) {
		if (newGeringesEinkommenCovid19 != geringesEinkommenCovid19) {
			NotificationChain msgs = null;
			if (geringesEinkommenCovid19 != null)
				msgs = ((InternalEObject)geringesEinkommenCovid19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19, null, msgs);
			if (newGeringesEinkommenCovid19 != null)
				msgs = ((InternalEObject)newGeringesEinkommenCovid19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19, null, msgs);
			msgs = basicSetGeringesEinkommenCovid19(newGeringesEinkommenCovid19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19, newGeringesEinkommenCovid19, newGeringesEinkommenCovid19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntgeltdatenDsrvNachweisbezugType getEntgeltdatenDsrv() {
		return entgeltdatenDsrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntgeltdatenDsrv(EntgeltdatenDsrvNachweisbezugType newEntgeltdatenDsrv, NotificationChain msgs) {
		EntgeltdatenDsrvNachweisbezugType oldEntgeltdatenDsrv = entgeltdatenDsrv;
		entgeltdatenDsrv = newEntgeltdatenDsrv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV, oldEntgeltdatenDsrv, newEntgeltdatenDsrv);
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
	public void setEntgeltdatenDsrv(EntgeltdatenDsrvNachweisbezugType newEntgeltdatenDsrv) {
		if (newEntgeltdatenDsrv != entgeltdatenDsrv) {
			NotificationChain msgs = null;
			if (entgeltdatenDsrv != null)
				msgs = ((InternalEObject)entgeltdatenDsrv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV, null, msgs);
			if (newEntgeltdatenDsrv != null)
				msgs = ((InternalEObject)newEntgeltdatenDsrv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV, null, msgs);
			msgs = basicSetEntgeltdatenDsrv(newEntgeltdatenDsrv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV, newEntgeltdatenDsrv, newEntgeltdatenDsrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGewerbebetrieb() {
		return gewerbebetrieb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGewerbebetrieb(boolean newGewerbebetrieb) {
		boolean oldGewerbebetrieb = gewerbebetrieb;
		gewerbebetrieb = newGewerbebetrieb;
		boolean oldGewerbebetriebESet = gewerbebetriebESet;
		gewerbebetriebESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB, oldGewerbebetrieb, gewerbebetrieb, !oldGewerbebetriebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGewerbebetrieb() {
		boolean oldGewerbebetrieb = gewerbebetrieb;
		boolean oldGewerbebetriebESet = gewerbebetriebESet;
		gewerbebetrieb = GEWERBEBETRIEB_EDEFAULT;
		gewerbebetriebESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB, oldGewerbebetrieb, GEWERBEBETRIEB_EDEFAULT, oldGewerbebetriebESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGewerbebetrieb() {
		return gewerbebetriebESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLandUndForstwirtschaft() {
		return landUndForstwirtschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandUndForstwirtschaft(boolean newLandUndForstwirtschaft) {
		boolean oldLandUndForstwirtschaft = landUndForstwirtschaft;
		landUndForstwirtschaft = newLandUndForstwirtschaft;
		boolean oldLandUndForstwirtschaftESet = landUndForstwirtschaftESet;
		landUndForstwirtschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT, oldLandUndForstwirtschaft, landUndForstwirtschaft, !oldLandUndForstwirtschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLandUndForstwirtschaft() {
		boolean oldLandUndForstwirtschaft = landUndForstwirtschaft;
		boolean oldLandUndForstwirtschaftESet = landUndForstwirtschaftESet;
		landUndForstwirtschaft = LAND_UND_FORSTWIRTSCHAFT_EDEFAULT;
		landUndForstwirtschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT, oldLandUndForstwirtschaft, LAND_UND_FORSTWIRTSCHAFT_EDEFAULT, oldLandUndForstwirtschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLandUndForstwirtschaft() {
		return landUndForstwirtschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFreiwilligendienst() {
		return freiwilligendienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreiwilligendienst(boolean newFreiwilligendienst) {
		boolean oldFreiwilligendienst = freiwilligendienst;
		freiwilligendienst = newFreiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, freiwilligendienst, !oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFreiwilligendienst() {
		boolean oldFreiwilligendienst = freiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;
		freiwilligendienstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, FREIWILLIGENDIENST_EDEFAULT, oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFreiwilligendienst() {
		return freiwilligendienstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMutter() {
		if (nachweisMutter == null) {
			nachweisMutter = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER);
		}
		return nachweisMutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType getSelbststaendigkeitGewerbeLandForstwirtschaft() {
		return selbststaendigkeitGewerbeLandForstwirtschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelbststaendigkeitGewerbeLandForstwirtschaft(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType newSelbststaendigkeitGewerbeLandForstwirtschaft, NotificationChain msgs) {
		SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType oldSelbststaendigkeitGewerbeLandForstwirtschaft = selbststaendigkeitGewerbeLandForstwirtschaft;
		selbststaendigkeitGewerbeLandForstwirtschaft = newSelbststaendigkeitGewerbeLandForstwirtschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, oldSelbststaendigkeitGewerbeLandForstwirtschaft, newSelbststaendigkeitGewerbeLandForstwirtschaft);
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
	public void setSelbststaendigkeitGewerbeLandForstwirtschaft(SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType newSelbststaendigkeitGewerbeLandForstwirtschaft) {
		if (newSelbststaendigkeitGewerbeLandForstwirtschaft != selbststaendigkeitGewerbeLandForstwirtschaft) {
			NotificationChain msgs = null;
			if (selbststaendigkeitGewerbeLandForstwirtschaft != null)
				msgs = ((InternalEObject)selbststaendigkeitGewerbeLandForstwirtschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, null, msgs);
			if (newSelbststaendigkeitGewerbeLandForstwirtschaft != null)
				msgs = ((InternalEObject)newSelbststaendigkeitGewerbeLandForstwirtschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, null, msgs);
			msgs = basicSetSelbststaendigkeitGewerbeLandForstwirtschaft(newSelbststaendigkeitGewerbeLandForstwirtschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT, newSelbststaendigkeitGewerbeLandForstwirtschaft, newSelbststaendigkeitGewerbeLandForstwirtschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommensersatzleistungenVorGeburtType getEinkommensersatzleistungen() {
		return einkommensersatzleistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommensersatzleistungen(EinkommensersatzleistungenVorGeburtType newEinkommensersatzleistungen, NotificationChain msgs) {
		EinkommensersatzleistungenVorGeburtType oldEinkommensersatzleistungen = einkommensersatzleistungen;
		einkommensersatzleistungen = newEinkommensersatzleistungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN, oldEinkommensersatzleistungen, newEinkommensersatzleistungen);
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
	public void setEinkommensersatzleistungen(EinkommensersatzleistungenVorGeburtType newEinkommensersatzleistungen) {
		if (newEinkommensersatzleistungen != einkommensersatzleistungen) {
			NotificationChain msgs = null;
			if (einkommensersatzleistungen != null)
				msgs = ((InternalEObject)einkommensersatzleistungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN, null, msgs);
			if (newEinkommensersatzleistungen != null)
				msgs = ((InternalEObject)newEinkommensersatzleistungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN, null, msgs);
			msgs = basicSetEinkommensersatzleistungen(newEinkommensersatzleistungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN, newEinkommensersatzleistungen, newEinkommensersatzleistungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return basicSetNichtselbststaendigeBeschaeftigung(null, msgs);
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19:
				return basicSetGeringesEinkommenCovid19(null, msgs);
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV:
				return basicSetEntgeltdatenDsrv(null, msgs);
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER:
				return ((InternalEList<?>)getNachweisMutter()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return basicSetSelbststaendigkeitGewerbeLandForstwirtschaft(null, msgs);
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN:
				return basicSetEinkommensersatzleistungen(null, msgs);
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
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return getNichtselbststaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG:
				return isBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				return isEinkommenAusNichtselbststaendigerTaetigkeit();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				return isSelbstaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19:
				return getGeringesEinkommenCovid19();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV:
				return getEntgeltdatenDsrv();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB:
				return isGewerbebetrieb();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				return isLandUndForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
				return isFreiwilligendienst();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER:
				return getNachweisMutter();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return getSelbststaendigkeitGewerbeLandForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN:
				return getEinkommensersatzleistungen();
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
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				setNichtselbststaendigeBeschaeftigung((NichtselbststaendigeBeschaeftigungVorGeburtType)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG:
				setBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				setEinkommenAusNichtselbststaendigerTaetigkeit((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				setSelbstaendigeBeschaeftigung((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19:
				setGeringesEinkommenCovid19((GeringesEinkommenCovid19Type)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV:
				setEntgeltdatenDsrv((EntgeltdatenDsrvNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB:
				setGewerbebetrieb((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				setLandUndForstwirtschaft((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
				setFreiwilligendienst((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER:
				getNachweisMutter().clear();
				getNachweisMutter().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				setSelbststaendigkeitGewerbeLandForstwirtschaft((SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType)newValue);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN:
				setEinkommensersatzleistungen((EinkommensersatzleistungenVorGeburtType)newValue);
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
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				setNichtselbststaendigeBeschaeftigung((NichtselbststaendigeBeschaeftigungVorGeburtType)null);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG:
				unsetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				unsetEinkommenAusNichtselbststaendigerTaetigkeit();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				unsetSelbstaendigeBeschaeftigung();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19:
				setGeringesEinkommenCovid19((GeringesEinkommenCovid19Type)null);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV:
				setEntgeltdatenDsrv((EntgeltdatenDsrvNachweisbezugType)null);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB:
				unsetGewerbebetrieb();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				unsetLandUndForstwirtschaft();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
				unsetFreiwilligendienst();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER:
				getNachweisMutter().clear();
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				setSelbststaendigkeitGewerbeLandForstwirtschaft((SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType)null);
				return;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN:
				setEinkommensersatzleistungen((EinkommensersatzleistungenVorGeburtType)null);
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
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NICHTSELBSTSTAENDIGE_BESCHAEFTIGUNG:
				return nichtselbststaendigeBeschaeftigung != null;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__BERUECKSICHTIGUNG_AUSSCHLIESSLICH_EINKOMMEN_NICHTSELBSTSTAENDIG:
				return isSetBeruecksichtigungAusschliesslichEinkommenNichtselbststaendig();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMEN_AUS_NICHTSELBSTSTAENDIGER_TAETIGKEIT:
				return isSetEinkommenAusNichtselbststaendigerTaetigkeit();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTAENDIGE_BESCHAEFTIGUNG:
				return isSetSelbstaendigeBeschaeftigung();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GERINGES_EINKOMMEN_COVID19:
				return geringesEinkommenCovid19 != null;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__ENTGELTDATEN_DSRV:
				return entgeltdatenDsrv != null;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__GEWERBEBETRIEB:
				return isSetGewerbebetrieb();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__LAND_UND_FORSTWIRTSCHAFT:
				return isSetLandUndForstwirtschaft();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__FREIWILLIGENDIENST:
				return isSetFreiwilligendienst();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__NACHWEIS_MUTTER:
				return nachweisMutter != null && !nachweisMutter.isEmpty();
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT:
				return selbststaendigkeitGewerbeLandForstwirtschaft != null;
			case ElterngeldPackage.EINKOMMEN_VOR_GEBURT_TYPE__EINKOMMENSERSATZLEISTUNGEN:
				return einkommensersatzleistungen != null;
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
		result.append(" (beruecksichtigungAusschliesslichEinkommenNichtselbststaendig: ");
		if (beruecksichtigungAusschliesslichEinkommenNichtselbststaendigESet) result.append(beruecksichtigungAusschliesslichEinkommenNichtselbststaendig); else result.append("<unset>");
		result.append(", einkommenAusNichtselbststaendigerTaetigkeit: ");
		if (einkommenAusNichtselbststaendigerTaetigkeitESet) result.append(einkommenAusNichtselbststaendigerTaetigkeit); else result.append("<unset>");
		result.append(", selbstaendigeBeschaeftigung: ");
		if (selbstaendigeBeschaeftigungESet) result.append(selbstaendigeBeschaeftigung); else result.append("<unset>");
		result.append(", gewerbebetrieb: ");
		if (gewerbebetriebESet) result.append(gewerbebetrieb); else result.append("<unset>");
		result.append(", landUndForstwirtschaft: ");
		if (landUndForstwirtschaftESet) result.append(landUndForstwirtschaft); else result.append("<unset>");
		result.append(", freiwilligendienst: ");
		if (freiwilligendienstESet) result.append(freiwilligendienst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinkommenVorGeburtTypeImpl
