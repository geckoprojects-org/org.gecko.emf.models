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

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AlleinerziehendenanspruchType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersandwegType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommenWaehrendBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ErwerbstaetigkeitBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GesetzlicheVertretungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.HaushaltszugehoerigkeitDesKindesType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindschaftsverhaeltnisType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType;

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
 * An implementation of the model object '<em><b>Elternteil Eins Elterngeldantrag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getPersoenlicheAngaben <em>Persoenliche Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getGewoehnlicherAufenthalt <em>Gewoehnlicher Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getKindschaftsverhaeltnis <em>Kindschaftsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getHaushaltszugehoerigkeitDesKindes <em>Haushaltszugehoerigkeit Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getAlleinerziehendenanspruch <em>Alleinerziehendenanspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getBeantragungElterngeld <em>Beantragung Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getKrankenversicherung <em>Krankenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getEinkommenVorGeburt <em>Einkommen Vor Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getEinkommenWaehrendBezugszeitraum <em>Einkommen Waehrend Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getBankverbindung <em>Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getZustimmungDatenabrufe <em>Zustimmung Datenabrufe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#isZustimmungAuskunftseinholungJobcenterArbeitsamt <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getKontaktmoeglichkeit <em>Kontaktmoeglichkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getSteuerlicheIdentifikationsnummer <em>Steuerliche Identifikationsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getNutzerkonto <em>Nutzerkonto</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getErwerbstaetigkeitBezugszeitraum <em>Erwerbstaetigkeit Bezugszeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getBescheidzustellungVersandweg <em>Bescheidzustellung Versandweg</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getGesetzlicheVertretung <em>Gesetzliche Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getElternzeit <em>Elternzeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#isZusammenveranlagungLiegtVor <em>Zusammenveranlagung Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternteilEinsElterngeldantragTypeImpl#getMitteilungAnBehoerde <em>Mitteilung An Behoerde</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElternteilEinsElterngeldantragTypeImpl extends MinimalEObjectImpl.Container implements ElternteilEinsElterngeldantragType {
	/**
	 * The cached value of the '{@link #getPersoenlicheAngaben() <em>Persoenliche Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersoenlicheAngaben()
	 * @generated
	 * @ordered
	 */
	protected PersoenlicheAngabenETType persoenlicheAngaben;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected AnschriftType anschrift;

	/**
	 * The cached value of the '{@link #getGewoehnlicherAufenthalt() <em>Gewoehnlicher Aufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGewoehnlicherAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected GewoehnlicherAufenthaltType gewoehnlicherAufenthalt;

	/**
	 * The cached value of the '{@link #getKindschaftsverhaeltnis() <em>Kindschaftsverhaeltnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindschaftsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected KindschaftsverhaeltnisType kindschaftsverhaeltnis;

	/**
	 * The cached value of the '{@link #getHaushaltszugehoerigkeitDesKindes() <em>Haushaltszugehoerigkeit Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaushaltszugehoerigkeitDesKindes()
	 * @generated
	 * @ordered
	 */
	protected HaushaltszugehoerigkeitDesKindesType haushaltszugehoerigkeitDesKindes;

	/**
	 * The cached value of the '{@link #getAlleinerziehendenanspruch() <em>Alleinerziehendenanspruch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlleinerziehendenanspruch()
	 * @generated
	 * @ordered
	 */
	protected AlleinerziehendenanspruchType alleinerziehendenanspruch;

	/**
	 * The cached value of the '{@link #getBeantragungElterngeld() <em>Beantragung Elterngeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungElterngeld()
	 * @generated
	 * @ordered
	 */
	protected BeantragungElterngeldType beantragungElterngeld;

	/**
	 * The cached value of the '{@link #getKrankenversicherung() <em>Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversicherung()
	 * @generated
	 * @ordered
	 */
	protected KrankenversicherungType krankenversicherung;

	/**
	 * The cached value of the '{@link #getEinkommenVorGeburt() <em>Einkommen Vor Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenVorGeburt()
	 * @generated
	 * @ordered
	 */
	protected EinkommenVorGeburtType einkommenVorGeburt;

	/**
	 * The cached value of the '{@link #getEinkommenWaehrendBezugszeitraum() <em>Einkommen Waehrend Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenWaehrendBezugszeitraum()
	 * @generated
	 * @ordered
	 */
	protected EinkommenWaehrendBezugszeitraumType einkommenWaehrendBezugszeitraum;

	/**
	 * The cached value of the '{@link #getBankverbindung() <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankverbindung()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungInhaberOptionalType bankverbindung;

	/**
	 * The cached value of the '{@link #getZustimmungDatenabrufe() <em>Zustimmung Datenabrufe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustimmungDatenabrufe()
	 * @generated
	 * @ordered
	 */
	protected ZustimmungDatenabrufeType zustimmungDatenabrufe;

	/**
	 * The default value of the '{@link #isZustimmungAuskunftseinholungJobcenterArbeitsamt() <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungAuskunftseinholungJobcenterArbeitsamt() <em>Zustimmung Auskunftseinholung Jobcenter Arbeitsamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungAuskunftseinholungJobcenterArbeitsamt()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungAuskunftseinholungJobcenterArbeitsamt = ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT_EDEFAULT;

	/**
	 * This is true if the Zustimmung Auskunftseinholung Jobcenter Arbeitsamt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungAuskunftseinholungJobcenterArbeitsamtESet;

	/**
	 * The cached value of the '{@link #getKontaktmoeglichkeit() <em>Kontaktmoeglichkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktmoeglichkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> kontaktmoeglichkeit;

	/**
	 * The default value of the '{@link #getSteuerlicheIdentifikationsnummer() <em>Steuerliche Identifikationsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerlicheIdentifikationsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String STEUERLICHE_IDENTIFIKATIONSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteuerlicheIdentifikationsnummer() <em>Steuerliche Identifikationsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerlicheIdentifikationsnummer()
	 * @generated
	 * @ordered
	 */
	protected String steuerlicheIdentifikationsnummer = STEUERLICHE_IDENTIFIKATIONSNUMMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNutzerkonto() <em>Nutzerkonto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzerkonto()
	 * @generated
	 * @ordered
	 */
	protected NutzerkontoType nutzerkonto;

	/**
	 * The cached value of the '{@link #getErwerbstaetigkeitBezugszeitraum() <em>Erwerbstaetigkeit Bezugszeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErwerbstaetigkeitBezugszeitraum()
	 * @generated
	 * @ordered
	 */
	protected ErwerbstaetigkeitBezugszeitraumType erwerbstaetigkeitBezugszeitraum;

	/**
	 * The cached value of the '{@link #getBescheidzustellungVersandweg() <em>Bescheidzustellung Versandweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBescheidzustellungVersandweg()
	 * @generated
	 * @ordered
	 */
	protected CodeVersandwegType bescheidzustellungVersandweg;

	/**
	 * The cached value of the '{@link #getGesetzlicheVertretung() <em>Gesetzliche Vertretung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesetzlicheVertretung()
	 * @generated
	 * @ordered
	 */
	protected GesetzlicheVertretungType gesetzlicheVertretung;

	/**
	 * The cached value of the '{@link #getElternzeit() <em>Elternzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternzeit()
	 * @generated
	 * @ordered
	 */
	protected ElternzeitType elternzeit;

	/**
	 * The default value of the '{@link #isZusammenveranlagungLiegtVor() <em>Zusammenveranlagung Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusammenveranlagungLiegtVor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSAMMENVERANLAGUNG_LIEGT_VOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZusammenveranlagungLiegtVor() <em>Zusammenveranlagung Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusammenveranlagungLiegtVor()
	 * @generated
	 * @ordered
	 */
	protected boolean zusammenveranlagungLiegtVor = ZUSAMMENVERANLAGUNG_LIEGT_VOR_EDEFAULT;

	/**
	 * This is true if the Zusammenveranlagung Liegt Vor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zusammenveranlagungLiegtVorESet;

	/**
	 * The default value of the '{@link #getMitteilungAnBehoerde() <em>Mitteilung An Behoerde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitteilungAnBehoerde()
	 * @generated
	 * @ordered
	 */
	protected static final String MITTEILUNG_AN_BEHOERDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMitteilungAnBehoerde() <em>Mitteilung An Behoerde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitteilungAnBehoerde()
	 * @generated
	 * @ordered
	 */
	protected String mitteilungAnBehoerde = MITTEILUNG_AN_BEHOERDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElternteilEinsElterngeldantragTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElternteilEinsElterngeldantragType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenETType getPersoenlicheAngaben() {
		return persoenlicheAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersoenlicheAngaben(PersoenlicheAngabenETType newPersoenlicheAngaben, NotificationChain msgs) {
		PersoenlicheAngabenETType oldPersoenlicheAngaben = persoenlicheAngaben;
		persoenlicheAngaben = newPersoenlicheAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN, oldPersoenlicheAngaben, newPersoenlicheAngaben);
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
	public void setPersoenlicheAngaben(PersoenlicheAngabenETType newPersoenlicheAngaben) {
		if (newPersoenlicheAngaben != persoenlicheAngaben) {
			NotificationChain msgs = null;
			if (persoenlicheAngaben != null)
				msgs = ((InternalEObject)persoenlicheAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN, null, msgs);
			if (newPersoenlicheAngaben != null)
				msgs = ((InternalEObject)newPersoenlicheAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN, null, msgs);
			msgs = basicSetPersoenlicheAngaben(newPersoenlicheAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN, newPersoenlicheAngaben, newPersoenlicheAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(AnschriftType newAnschrift, NotificationChain msgs) {
		AnschriftType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(AnschriftType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GewoehnlicherAufenthaltType getGewoehnlicherAufenthalt() {
		return gewoehnlicherAufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGewoehnlicherAufenthalt(GewoehnlicherAufenthaltType newGewoehnlicherAufenthalt, NotificationChain msgs) {
		GewoehnlicherAufenthaltType oldGewoehnlicherAufenthalt = gewoehnlicherAufenthalt;
		gewoehnlicherAufenthalt = newGewoehnlicherAufenthalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT, oldGewoehnlicherAufenthalt, newGewoehnlicherAufenthalt);
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
	public void setGewoehnlicherAufenthalt(GewoehnlicherAufenthaltType newGewoehnlicherAufenthalt) {
		if (newGewoehnlicherAufenthalt != gewoehnlicherAufenthalt) {
			NotificationChain msgs = null;
			if (gewoehnlicherAufenthalt != null)
				msgs = ((InternalEObject)gewoehnlicherAufenthalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT, null, msgs);
			if (newGewoehnlicherAufenthalt != null)
				msgs = ((InternalEObject)newGewoehnlicherAufenthalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT, null, msgs);
			msgs = basicSetGewoehnlicherAufenthalt(newGewoehnlicherAufenthalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT, newGewoehnlicherAufenthalt, newGewoehnlicherAufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindschaftsverhaeltnisType getKindschaftsverhaeltnis() {
		return kindschaftsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindschaftsverhaeltnis(KindschaftsverhaeltnisType newKindschaftsverhaeltnis, NotificationChain msgs) {
		KindschaftsverhaeltnisType oldKindschaftsverhaeltnis = kindschaftsverhaeltnis;
		kindschaftsverhaeltnis = newKindschaftsverhaeltnis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS, oldKindschaftsverhaeltnis, newKindschaftsverhaeltnis);
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
	public void setKindschaftsverhaeltnis(KindschaftsverhaeltnisType newKindschaftsverhaeltnis) {
		if (newKindschaftsverhaeltnis != kindschaftsverhaeltnis) {
			NotificationChain msgs = null;
			if (kindschaftsverhaeltnis != null)
				msgs = ((InternalEObject)kindschaftsverhaeltnis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS, null, msgs);
			if (newKindschaftsverhaeltnis != null)
				msgs = ((InternalEObject)newKindschaftsverhaeltnis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS, null, msgs);
			msgs = basicSetKindschaftsverhaeltnis(newKindschaftsverhaeltnis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS, newKindschaftsverhaeltnis, newKindschaftsverhaeltnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaushaltszugehoerigkeitDesKindesType getHaushaltszugehoerigkeitDesKindes() {
		return haushaltszugehoerigkeitDesKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaushaltszugehoerigkeitDesKindes(HaushaltszugehoerigkeitDesKindesType newHaushaltszugehoerigkeitDesKindes, NotificationChain msgs) {
		HaushaltszugehoerigkeitDesKindesType oldHaushaltszugehoerigkeitDesKindes = haushaltszugehoerigkeitDesKindes;
		haushaltszugehoerigkeitDesKindes = newHaushaltszugehoerigkeitDesKindes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES, oldHaushaltszugehoerigkeitDesKindes, newHaushaltszugehoerigkeitDesKindes);
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
	public void setHaushaltszugehoerigkeitDesKindes(HaushaltszugehoerigkeitDesKindesType newHaushaltszugehoerigkeitDesKindes) {
		if (newHaushaltszugehoerigkeitDesKindes != haushaltszugehoerigkeitDesKindes) {
			NotificationChain msgs = null;
			if (haushaltszugehoerigkeitDesKindes != null)
				msgs = ((InternalEObject)haushaltszugehoerigkeitDesKindes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES, null, msgs);
			if (newHaushaltszugehoerigkeitDesKindes != null)
				msgs = ((InternalEObject)newHaushaltszugehoerigkeitDesKindes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES, null, msgs);
			msgs = basicSetHaushaltszugehoerigkeitDesKindes(newHaushaltszugehoerigkeitDesKindes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES, newHaushaltszugehoerigkeitDesKindes, newHaushaltszugehoerigkeitDesKindes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlleinerziehendenanspruchType getAlleinerziehendenanspruch() {
		return alleinerziehendenanspruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlleinerziehendenanspruch(AlleinerziehendenanspruchType newAlleinerziehendenanspruch, NotificationChain msgs) {
		AlleinerziehendenanspruchType oldAlleinerziehendenanspruch = alleinerziehendenanspruch;
		alleinerziehendenanspruch = newAlleinerziehendenanspruch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH, oldAlleinerziehendenanspruch, newAlleinerziehendenanspruch);
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
	public void setAlleinerziehendenanspruch(AlleinerziehendenanspruchType newAlleinerziehendenanspruch) {
		if (newAlleinerziehendenanspruch != alleinerziehendenanspruch) {
			NotificationChain msgs = null;
			if (alleinerziehendenanspruch != null)
				msgs = ((InternalEObject)alleinerziehendenanspruch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH, null, msgs);
			if (newAlleinerziehendenanspruch != null)
				msgs = ((InternalEObject)newAlleinerziehendenanspruch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH, null, msgs);
			msgs = basicSetAlleinerziehendenanspruch(newAlleinerziehendenanspruch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH, newAlleinerziehendenanspruch, newAlleinerziehendenanspruch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeantragungElterngeldType getBeantragungElterngeld() {
		return beantragungElterngeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeantragungElterngeld(BeantragungElterngeldType newBeantragungElterngeld, NotificationChain msgs) {
		BeantragungElterngeldType oldBeantragungElterngeld = beantragungElterngeld;
		beantragungElterngeld = newBeantragungElterngeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD, oldBeantragungElterngeld, newBeantragungElterngeld);
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
	public void setBeantragungElterngeld(BeantragungElterngeldType newBeantragungElterngeld) {
		if (newBeantragungElterngeld != beantragungElterngeld) {
			NotificationChain msgs = null;
			if (beantragungElterngeld != null)
				msgs = ((InternalEObject)beantragungElterngeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD, null, msgs);
			if (newBeantragungElterngeld != null)
				msgs = ((InternalEObject)newBeantragungElterngeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD, null, msgs);
			msgs = basicSetBeantragungElterngeld(newBeantragungElterngeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD, newBeantragungElterngeld, newBeantragungElterngeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankenversicherungType getKrankenversicherung() {
		return krankenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKrankenversicherung(KrankenversicherungType newKrankenversicherung, NotificationChain msgs) {
		KrankenversicherungType oldKrankenversicherung = krankenversicherung;
		krankenversicherung = newKrankenversicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG, oldKrankenversicherung, newKrankenversicherung);
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
	public void setKrankenversicherung(KrankenversicherungType newKrankenversicherung) {
		if (newKrankenversicherung != krankenversicherung) {
			NotificationChain msgs = null;
			if (krankenversicherung != null)
				msgs = ((InternalEObject)krankenversicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG, null, msgs);
			if (newKrankenversicherung != null)
				msgs = ((InternalEObject)newKrankenversicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG, null, msgs);
			msgs = basicSetKrankenversicherung(newKrankenversicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG, newKrankenversicherung, newKrankenversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenVorGeburtType getEinkommenVorGeburt() {
		return einkommenVorGeburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommenVorGeburt(EinkommenVorGeburtType newEinkommenVorGeburt, NotificationChain msgs) {
		EinkommenVorGeburtType oldEinkommenVorGeburt = einkommenVorGeburt;
		einkommenVorGeburt = newEinkommenVorGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT, oldEinkommenVorGeburt, newEinkommenVorGeburt);
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
	public void setEinkommenVorGeburt(EinkommenVorGeburtType newEinkommenVorGeburt) {
		if (newEinkommenVorGeburt != einkommenVorGeburt) {
			NotificationChain msgs = null;
			if (einkommenVorGeburt != null)
				msgs = ((InternalEObject)einkommenVorGeburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT, null, msgs);
			if (newEinkommenVorGeburt != null)
				msgs = ((InternalEObject)newEinkommenVorGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT, null, msgs);
			msgs = basicSetEinkommenVorGeburt(newEinkommenVorGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT, newEinkommenVorGeburt, newEinkommenVorGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenWaehrendBezugszeitraumType getEinkommenWaehrendBezugszeitraum() {
		return einkommenWaehrendBezugszeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommenWaehrendBezugszeitraum(EinkommenWaehrendBezugszeitraumType newEinkommenWaehrendBezugszeitraum, NotificationChain msgs) {
		EinkommenWaehrendBezugszeitraumType oldEinkommenWaehrendBezugszeitraum = einkommenWaehrendBezugszeitraum;
		einkommenWaehrendBezugszeitraum = newEinkommenWaehrendBezugszeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM, oldEinkommenWaehrendBezugszeitraum, newEinkommenWaehrendBezugszeitraum);
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
	public void setEinkommenWaehrendBezugszeitraum(EinkommenWaehrendBezugszeitraumType newEinkommenWaehrendBezugszeitraum) {
		if (newEinkommenWaehrendBezugszeitraum != einkommenWaehrendBezugszeitraum) {
			NotificationChain msgs = null;
			if (einkommenWaehrendBezugszeitraum != null)
				msgs = ((InternalEObject)einkommenWaehrendBezugszeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM, null, msgs);
			if (newEinkommenWaehrendBezugszeitraum != null)
				msgs = ((InternalEObject)newEinkommenWaehrendBezugszeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM, null, msgs);
			msgs = basicSetEinkommenWaehrendBezugszeitraum(newEinkommenWaehrendBezugszeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM, newEinkommenWaehrendBezugszeitraum, newEinkommenWaehrendBezugszeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungInhaberOptionalType getBankverbindung() {
		return bankverbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankverbindung(BankverbindungInhaberOptionalType newBankverbindung, NotificationChain msgs) {
		BankverbindungInhaberOptionalType oldBankverbindung = bankverbindung;
		bankverbindung = newBankverbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG, oldBankverbindung, newBankverbindung);
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
	public void setBankverbindung(BankverbindungInhaberOptionalType newBankverbindung) {
		if (newBankverbindung != bankverbindung) {
			NotificationChain msgs = null;
			if (bankverbindung != null)
				msgs = ((InternalEObject)bankverbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG, null, msgs);
			if (newBankverbindung != null)
				msgs = ((InternalEObject)newBankverbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG, null, msgs);
			msgs = basicSetBankverbindung(newBankverbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG, newBankverbindung, newBankverbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZustimmungDatenabrufeType getZustimmungDatenabrufe() {
		return zustimmungDatenabrufe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZustimmungDatenabrufe(ZustimmungDatenabrufeType newZustimmungDatenabrufe, NotificationChain msgs) {
		ZustimmungDatenabrufeType oldZustimmungDatenabrufe = zustimmungDatenabrufe;
		zustimmungDatenabrufe = newZustimmungDatenabrufe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE, oldZustimmungDatenabrufe, newZustimmungDatenabrufe);
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
	public void setZustimmungDatenabrufe(ZustimmungDatenabrufeType newZustimmungDatenabrufe) {
		if (newZustimmungDatenabrufe != zustimmungDatenabrufe) {
			NotificationChain msgs = null;
			if (zustimmungDatenabrufe != null)
				msgs = ((InternalEObject)zustimmungDatenabrufe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE, null, msgs);
			if (newZustimmungDatenabrufe != null)
				msgs = ((InternalEObject)newZustimmungDatenabrufe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE, null, msgs);
			msgs = basicSetZustimmungDatenabrufe(newZustimmungDatenabrufe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE, newZustimmungDatenabrufe, newZustimmungDatenabrufe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungAuskunftseinholungJobcenterArbeitsamt() {
		return zustimmungAuskunftseinholungJobcenterArbeitsamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungAuskunftseinholungJobcenterArbeitsamt(boolean newZustimmungAuskunftseinholungJobcenterArbeitsamt) {
		boolean oldZustimmungAuskunftseinholungJobcenterArbeitsamt = zustimmungAuskunftseinholungJobcenterArbeitsamt;
		zustimmungAuskunftseinholungJobcenterArbeitsamt = newZustimmungAuskunftseinholungJobcenterArbeitsamt;
		boolean oldZustimmungAuskunftseinholungJobcenterArbeitsamtESet = zustimmungAuskunftseinholungJobcenterArbeitsamtESet;
		zustimmungAuskunftseinholungJobcenterArbeitsamtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT, oldZustimmungAuskunftseinholungJobcenterArbeitsamt, zustimmungAuskunftseinholungJobcenterArbeitsamt, !oldZustimmungAuskunftseinholungJobcenterArbeitsamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungAuskunftseinholungJobcenterArbeitsamt() {
		boolean oldZustimmungAuskunftseinholungJobcenterArbeitsamt = zustimmungAuskunftseinholungJobcenterArbeitsamt;
		boolean oldZustimmungAuskunftseinholungJobcenterArbeitsamtESet = zustimmungAuskunftseinholungJobcenterArbeitsamtESet;
		zustimmungAuskunftseinholungJobcenterArbeitsamt = ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT_EDEFAULT;
		zustimmungAuskunftseinholungJobcenterArbeitsamtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT, oldZustimmungAuskunftseinholungJobcenterArbeitsamt, ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT_EDEFAULT, oldZustimmungAuskunftseinholungJobcenterArbeitsamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungAuskunftseinholungJobcenterArbeitsamt() {
		return zustimmungAuskunftseinholungJobcenterArbeitsamtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getKontaktmoeglichkeit() {
		if (kontaktmoeglichkeit == null) {
			kontaktmoeglichkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT);
		}
		return kontaktmoeglichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSteuerlicheIdentifikationsnummer() {
		return steuerlicheIdentifikationsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteuerlicheIdentifikationsnummer(String newSteuerlicheIdentifikationsnummer) {
		String oldSteuerlicheIdentifikationsnummer = steuerlicheIdentifikationsnummer;
		steuerlicheIdentifikationsnummer = newSteuerlicheIdentifikationsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER, oldSteuerlicheIdentifikationsnummer, steuerlicheIdentifikationsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutzerkontoType getNutzerkonto() {
		return nutzerkonto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutzerkonto(NutzerkontoType newNutzerkonto, NotificationChain msgs) {
		NutzerkontoType oldNutzerkonto = nutzerkonto;
		nutzerkonto = newNutzerkonto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO, oldNutzerkonto, newNutzerkonto);
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
	public void setNutzerkonto(NutzerkontoType newNutzerkonto) {
		if (newNutzerkonto != nutzerkonto) {
			NotificationChain msgs = null;
			if (nutzerkonto != null)
				msgs = ((InternalEObject)nutzerkonto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO, null, msgs);
			if (newNutzerkonto != null)
				msgs = ((InternalEObject)newNutzerkonto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO, null, msgs);
			msgs = basicSetNutzerkonto(newNutzerkonto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO, newNutzerkonto, newNutzerkonto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErwerbstaetigkeitBezugszeitraumType getErwerbstaetigkeitBezugszeitraum() {
		return erwerbstaetigkeitBezugszeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErwerbstaetigkeitBezugszeitraum(ErwerbstaetigkeitBezugszeitraumType newErwerbstaetigkeitBezugszeitraum, NotificationChain msgs) {
		ErwerbstaetigkeitBezugszeitraumType oldErwerbstaetigkeitBezugszeitraum = erwerbstaetigkeitBezugszeitraum;
		erwerbstaetigkeitBezugszeitraum = newErwerbstaetigkeitBezugszeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, oldErwerbstaetigkeitBezugszeitraum, newErwerbstaetigkeitBezugszeitraum);
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
	public void setErwerbstaetigkeitBezugszeitraum(ErwerbstaetigkeitBezugszeitraumType newErwerbstaetigkeitBezugszeitraum) {
		if (newErwerbstaetigkeitBezugszeitraum != erwerbstaetigkeitBezugszeitraum) {
			NotificationChain msgs = null;
			if (erwerbstaetigkeitBezugszeitraum != null)
				msgs = ((InternalEObject)erwerbstaetigkeitBezugszeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, null, msgs);
			if (newErwerbstaetigkeitBezugszeitraum != null)
				msgs = ((InternalEObject)newErwerbstaetigkeitBezugszeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, null, msgs);
			msgs = basicSetErwerbstaetigkeitBezugszeitraum(newErwerbstaetigkeitBezugszeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM, newErwerbstaetigkeitBezugszeitraum, newErwerbstaetigkeitBezugszeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVersandwegType getBescheidzustellungVersandweg() {
		return bescheidzustellungVersandweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBescheidzustellungVersandweg(CodeVersandwegType newBescheidzustellungVersandweg, NotificationChain msgs) {
		CodeVersandwegType oldBescheidzustellungVersandweg = bescheidzustellungVersandweg;
		bescheidzustellungVersandweg = newBescheidzustellungVersandweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG, oldBescheidzustellungVersandweg, newBescheidzustellungVersandweg);
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
	public void setBescheidzustellungVersandweg(CodeVersandwegType newBescheidzustellungVersandweg) {
		if (newBescheidzustellungVersandweg != bescheidzustellungVersandweg) {
			NotificationChain msgs = null;
			if (bescheidzustellungVersandweg != null)
				msgs = ((InternalEObject)bescheidzustellungVersandweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG, null, msgs);
			if (newBescheidzustellungVersandweg != null)
				msgs = ((InternalEObject)newBescheidzustellungVersandweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG, null, msgs);
			msgs = basicSetBescheidzustellungVersandweg(newBescheidzustellungVersandweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG, newBescheidzustellungVersandweg, newBescheidzustellungVersandweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GesetzlicheVertretungType getGesetzlicheVertretung() {
		return gesetzlicheVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGesetzlicheVertretung(GesetzlicheVertretungType newGesetzlicheVertretung, NotificationChain msgs) {
		GesetzlicheVertretungType oldGesetzlicheVertretung = gesetzlicheVertretung;
		gesetzlicheVertretung = newGesetzlicheVertretung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG, oldGesetzlicheVertretung, newGesetzlicheVertretung);
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
	public void setGesetzlicheVertretung(GesetzlicheVertretungType newGesetzlicheVertretung) {
		if (newGesetzlicheVertretung != gesetzlicheVertretung) {
			NotificationChain msgs = null;
			if (gesetzlicheVertretung != null)
				msgs = ((InternalEObject)gesetzlicheVertretung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG, null, msgs);
			if (newGesetzlicheVertretung != null)
				msgs = ((InternalEObject)newGesetzlicheVertretung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG, null, msgs);
			msgs = basicSetGesetzlicheVertretung(newGesetzlicheVertretung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG, newGesetzlicheVertretung, newGesetzlicheVertretung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternzeitType getElternzeit() {
		return elternzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternzeit(ElternzeitType newElternzeit, NotificationChain msgs) {
		ElternzeitType oldElternzeit = elternzeit;
		elternzeit = newElternzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT, oldElternzeit, newElternzeit);
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
	public void setElternzeit(ElternzeitType newElternzeit) {
		if (newElternzeit != elternzeit) {
			NotificationChain msgs = null;
			if (elternzeit != null)
				msgs = ((InternalEObject)elternzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT, null, msgs);
			if (newElternzeit != null)
				msgs = ((InternalEObject)newElternzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT, null, msgs);
			msgs = basicSetElternzeit(newElternzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT, newElternzeit, newElternzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZusammenveranlagungLiegtVor() {
		return zusammenveranlagungLiegtVor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusammenveranlagungLiegtVor(boolean newZusammenveranlagungLiegtVor) {
		boolean oldZusammenveranlagungLiegtVor = zusammenveranlagungLiegtVor;
		zusammenveranlagungLiegtVor = newZusammenveranlagungLiegtVor;
		boolean oldZusammenveranlagungLiegtVorESet = zusammenveranlagungLiegtVorESet;
		zusammenveranlagungLiegtVorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR, oldZusammenveranlagungLiegtVor, zusammenveranlagungLiegtVor, !oldZusammenveranlagungLiegtVorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZusammenveranlagungLiegtVor() {
		boolean oldZusammenveranlagungLiegtVor = zusammenveranlagungLiegtVor;
		boolean oldZusammenveranlagungLiegtVorESet = zusammenveranlagungLiegtVorESet;
		zusammenveranlagungLiegtVor = ZUSAMMENVERANLAGUNG_LIEGT_VOR_EDEFAULT;
		zusammenveranlagungLiegtVorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR, oldZusammenveranlagungLiegtVor, ZUSAMMENVERANLAGUNG_LIEGT_VOR_EDEFAULT, oldZusammenveranlagungLiegtVorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZusammenveranlagungLiegtVor() {
		return zusammenveranlagungLiegtVorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMitteilungAnBehoerde() {
		return mitteilungAnBehoerde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitteilungAnBehoerde(String newMitteilungAnBehoerde) {
		String oldMitteilungAnBehoerde = mitteilungAnBehoerde;
		mitteilungAnBehoerde = newMitteilungAnBehoerde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE, oldMitteilungAnBehoerde, mitteilungAnBehoerde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN:
				return basicSetPersoenlicheAngaben(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT:
				return basicSetGewoehnlicherAufenthalt(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS:
				return basicSetKindschaftsverhaeltnis(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES:
				return basicSetHaushaltszugehoerigkeitDesKindes(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH:
				return basicSetAlleinerziehendenanspruch(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD:
				return basicSetBeantragungElterngeld(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG:
				return basicSetKrankenversicherung(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT:
				return basicSetEinkommenVorGeburt(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM:
				return basicSetEinkommenWaehrendBezugszeitraum(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG:
				return basicSetBankverbindung(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE:
				return basicSetZustimmungDatenabrufe(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT:
				return ((InternalEList<?>)getKontaktmoeglichkeit()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO:
				return basicSetNutzerkonto(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				return basicSetErwerbstaetigkeitBezugszeitraum(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG:
				return basicSetBescheidzustellungVersandweg(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG:
				return basicSetGesetzlicheVertretung(null, msgs);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT:
				return basicSetElternzeit(null, msgs);
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
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN:
				return getPersoenlicheAngaben();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT:
				return getAnschrift();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT:
				return getGewoehnlicherAufenthalt();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS:
				return getKindschaftsverhaeltnis();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES:
				return getHaushaltszugehoerigkeitDesKindes();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH:
				return getAlleinerziehendenanspruch();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD:
				return getBeantragungElterngeld();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG:
				return getKrankenversicherung();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT:
				return getEinkommenVorGeburt();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM:
				return getEinkommenWaehrendBezugszeitraum();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG:
				return getBankverbindung();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE:
				return getZustimmungDatenabrufe();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT:
				return isZustimmungAuskunftseinholungJobcenterArbeitsamt();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT:
				return getKontaktmoeglichkeit();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER:
				return getSteuerlicheIdentifikationsnummer();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO:
				return getNutzerkonto();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				return getErwerbstaetigkeitBezugszeitraum();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG:
				return getBescheidzustellungVersandweg();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG:
				return getGesetzlicheVertretung();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT:
				return getElternzeit();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR:
				return isZusammenveranlagungLiegtVor();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE:
				return getMitteilungAnBehoerde();
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
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN:
				setPersoenlicheAngaben((PersoenlicheAngabenETType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT:
				setAnschrift((AnschriftType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT:
				setGewoehnlicherAufenthalt((GewoehnlicherAufenthaltType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS:
				setKindschaftsverhaeltnis((KindschaftsverhaeltnisType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES:
				setHaushaltszugehoerigkeitDesKindes((HaushaltszugehoerigkeitDesKindesType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH:
				setAlleinerziehendenanspruch((AlleinerziehendenanspruchType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD:
				setBeantragungElterngeld((BeantragungElterngeldType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG:
				setKrankenversicherung((KrankenversicherungType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT:
				setEinkommenVorGeburt((EinkommenVorGeburtType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM:
				setEinkommenWaehrendBezugszeitraum((EinkommenWaehrendBezugszeitraumType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungInhaberOptionalType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE:
				setZustimmungDatenabrufe((ZustimmungDatenabrufeType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT:
				setZustimmungAuskunftseinholungJobcenterArbeitsamt((Boolean)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT:
				getKontaktmoeglichkeit().clear();
				getKontaktmoeglichkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER:
				setSteuerlicheIdentifikationsnummer((String)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO:
				setNutzerkonto((NutzerkontoType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				setErwerbstaetigkeitBezugszeitraum((ErwerbstaetigkeitBezugszeitraumType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG:
				setBescheidzustellungVersandweg((CodeVersandwegType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG:
				setGesetzlicheVertretung((GesetzlicheVertretungType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT:
				setElternzeit((ElternzeitType)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR:
				setZusammenveranlagungLiegtVor((Boolean)newValue);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE:
				setMitteilungAnBehoerde((String)newValue);
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
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN:
				setPersoenlicheAngaben((PersoenlicheAngabenETType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT:
				setAnschrift((AnschriftType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT:
				setGewoehnlicherAufenthalt((GewoehnlicherAufenthaltType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS:
				setKindschaftsverhaeltnis((KindschaftsverhaeltnisType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES:
				setHaushaltszugehoerigkeitDesKindes((HaushaltszugehoerigkeitDesKindesType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH:
				setAlleinerziehendenanspruch((AlleinerziehendenanspruchType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD:
				setBeantragungElterngeld((BeantragungElterngeldType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG:
				setKrankenversicherung((KrankenversicherungType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT:
				setEinkommenVorGeburt((EinkommenVorGeburtType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM:
				setEinkommenWaehrendBezugszeitraum((EinkommenWaehrendBezugszeitraumType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungInhaberOptionalType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE:
				setZustimmungDatenabrufe((ZustimmungDatenabrufeType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT:
				unsetZustimmungAuskunftseinholungJobcenterArbeitsamt();
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT:
				getKontaktmoeglichkeit().clear();
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER:
				setSteuerlicheIdentifikationsnummer(STEUERLICHE_IDENTIFIKATIONSNUMMER_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO:
				setNutzerkonto((NutzerkontoType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				setErwerbstaetigkeitBezugszeitraum((ErwerbstaetigkeitBezugszeitraumType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG:
				setBescheidzustellungVersandweg((CodeVersandwegType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG:
				setGesetzlicheVertretung((GesetzlicheVertretungType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT:
				setElternzeit((ElternzeitType)null);
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR:
				unsetZusammenveranlagungLiegtVor();
				return;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE:
				setMitteilungAnBehoerde(MITTEILUNG_AN_BEHOERDE_EDEFAULT);
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
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__PERSOENLICHE_ANGABEN:
				return persoenlicheAngaben != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ANSCHRIFT:
				return anschrift != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GEWOEHNLICHER_AUFENTHALT:
				return gewoehnlicherAufenthalt != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KINDSCHAFTSVERHAELTNIS:
				return kindschaftsverhaeltnis != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__HAUSHALTSZUGEHOERIGKEIT_DES_KINDES:
				return haushaltszugehoerigkeitDesKindes != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ALLEINERZIEHENDENANSPRUCH:
				return alleinerziehendenanspruch != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BEANTRAGUNG_ELTERNGELD:
				return beantragungElterngeld != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KRANKENVERSICHERUNG:
				return krankenversicherung != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_VOR_GEBURT:
				return einkommenVorGeburt != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__EINKOMMEN_WAEHREND_BEZUGSZEITRAUM:
				return einkommenWaehrendBezugszeitraum != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BANKVERBINDUNG:
				return bankverbindung != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_DATENABRUFE:
				return zustimmungDatenabrufe != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSTIMMUNG_AUSKUNFTSEINHOLUNG_JOBCENTER_ARBEITSAMT:
				return isSetZustimmungAuskunftseinholungJobcenterArbeitsamt();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__KONTAKTMOEGLICHKEIT:
				return kontaktmoeglichkeit != null && !kontaktmoeglichkeit.isEmpty();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__STEUERLICHE_IDENTIFIKATIONSNUMMER:
				return STEUERLICHE_IDENTIFIKATIONSNUMMER_EDEFAULT == null ? steuerlicheIdentifikationsnummer != null : !STEUERLICHE_IDENTIFIKATIONSNUMMER_EDEFAULT.equals(steuerlicheIdentifikationsnummer);
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__NUTZERKONTO:
				return nutzerkonto != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ERWERBSTAETIGKEIT_BEZUGSZEITRAUM:
				return erwerbstaetigkeitBezugszeitraum != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__BESCHEIDZUSTELLUNG_VERSANDWEG:
				return bescheidzustellungVersandweg != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__GESETZLICHE_VERTRETUNG:
				return gesetzlicheVertretung != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ELTERNZEIT:
				return elternzeit != null;
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__ZUSAMMENVERANLAGUNG_LIEGT_VOR:
				return isSetZusammenveranlagungLiegtVor();
			case ElterngeldPackage.ELTERNTEIL_EINS_ELTERNGELDANTRAG_TYPE__MITTEILUNG_AN_BEHOERDE:
				return MITTEILUNG_AN_BEHOERDE_EDEFAULT == null ? mitteilungAnBehoerde != null : !MITTEILUNG_AN_BEHOERDE_EDEFAULT.equals(mitteilungAnBehoerde);
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
		result.append(" (zustimmungAuskunftseinholungJobcenterArbeitsamt: ");
		if (zustimmungAuskunftseinholungJobcenterArbeitsamtESet) result.append(zustimmungAuskunftseinholungJobcenterArbeitsamt); else result.append("<unset>");
		result.append(", steuerlicheIdentifikationsnummer: ");
		result.append(steuerlicheIdentifikationsnummer);
		result.append(", zusammenveranlagungLiegtVor: ");
		if (zusammenveranlagungLiegtVorESet) result.append(zusammenveranlagungLiegtVor); else result.append("<unset>");
		result.append(", mitteilungAnBehoerde: ");
		result.append(mitteilungAnBehoerde);
		result.append(')');
		return result.toString();
	}

} //ElternteilEinsElterngeldantragTypeImpl
