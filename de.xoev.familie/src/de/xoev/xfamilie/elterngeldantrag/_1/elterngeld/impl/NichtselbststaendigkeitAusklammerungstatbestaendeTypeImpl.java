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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.NichtselbststaendigkeitAusklammerungstatbestaendeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nichtselbststaendigkeit Ausklammerungstatbestaende Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isMutterschaftsgeldbezugVorGeburtAntragskind <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisMutterschaftsgeldbezugAntragskind <em>Nachweis Mutterschaftsgeldbezug Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isMutterschaftsgeldbezugVorGeburtaelteresKind <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisMutterschaftsgeldbezugAelteresKind <em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isElterngeldbezugAelteresKind <em>Elterngeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisElterngeldbezugAelteresKind <em>Nachweis Elterngeldbezug Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isMoeglicheEinkommensverluste <em>Moegliche Einkommensverluste</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisMoeglicheEinkommensverluste <em>Nachweis Moegliche Einkommensverluste</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isEinkommensverlustWehrUndZivildienst <em>Einkommensverlust Wehr Und Zivildienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisEinkommensverlustWehrUndZivildienst <em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isAntragAusklammerungsverzicht <em>Antrag Ausklammerungsverzicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getZeitraumAntragAusklammerungsverzicht <em>Zeitraum Antrag Ausklammerungsverzicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getNachweisAelteresBesondersFruehGeborenesKind <em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl#getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl extends MinimalEObjectImpl.Container implements NichtselbststaendigkeitAusklammerungstatbestaendeType {
	/**
	 * The default value of the '{@link #isMutterschaftsgeldbezugVorGeburtAntragskind() <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutterschaftsgeldbezugVorGeburtAntragskind() <em>Mutterschaftsgeldbezug Vor Geburt Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeldbezugVorGeburtAntragskind()
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeldbezugVorGeburtAntragskind = MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND_EDEFAULT;

	/**
	 * This is true if the Mutterschaftsgeldbezug Vor Geburt Antragskind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeldbezugVorGeburtAntragskindESet;

	/**
	 * The cached value of the '{@link #getNachweisMutterschaftsgeldbezugAntragskind() <em>Nachweis Mutterschaftsgeldbezug Antragskind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMutterschaftsgeldbezugAntragskind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMutterschaftsgeldbezugAntragskind;

	/**
	 * The default value of the '{@link #isMutterschaftsgeldbezugVorGeburtaelteresKind() <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutterschaftsgeldbezugVorGeburtaelteresKind() <em>Mutterschaftsgeldbezug Vor Geburtaelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeldbezugVorGeburtaelteresKind()
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeldbezugVorGeburtaelteresKind = MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND_EDEFAULT;

	/**
	 * This is true if the Mutterschaftsgeldbezug Vor Geburtaelteres Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeldbezugVorGeburtaelteresKindESet;

	/**
	 * The cached value of the '{@link #getNachweisMutterschaftsgeldbezugAelteresKind() <em>Nachweis Mutterschaftsgeldbezug Aelteres Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMutterschaftsgeldbezugAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMutterschaftsgeldbezugAelteresKind;

	/**
	 * The default value of the '{@link #isElterngeldbezugAelteresKind() <em>Elterngeldbezug Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldbezugAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELTERNGELDBEZUG_AELTERES_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElterngeldbezugAelteresKind() <em>Elterngeldbezug Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldbezugAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldbezugAelteresKind = ELTERNGELDBEZUG_AELTERES_KIND_EDEFAULT;

	/**
	 * This is true if the Elterngeldbezug Aelteres Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldbezugAelteresKindESet;

	/**
	 * The cached value of the '{@link #getNachweisElterngeldbezugAelteresKind() <em>Nachweis Elterngeldbezug Aelteres Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisElterngeldbezugAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisElterngeldbezugAelteresKind;

	/**
	 * The default value of the '{@link #isMoeglicheEinkommensverluste() <em>Moegliche Einkommensverluste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoeglicheEinkommensverluste()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOEGLICHE_EINKOMMENSVERLUSTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoeglicheEinkommensverluste() <em>Moegliche Einkommensverluste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoeglicheEinkommensverluste()
	 * @generated
	 * @ordered
	 */
	protected boolean moeglicheEinkommensverluste = MOEGLICHE_EINKOMMENSVERLUSTE_EDEFAULT;

	/**
	 * This is true if the Moegliche Einkommensverluste attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moeglicheEinkommensverlusteESet;

	/**
	 * The cached value of the '{@link #getNachweisMoeglicheEinkommensverluste() <em>Nachweis Moegliche Einkommensverluste</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMoeglicheEinkommensverluste()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMoeglicheEinkommensverluste;

	/**
	 * The default value of the '{@link #isEinkommensverlustWehrUndZivildienst() <em>Einkommensverlust Wehr Und Zivildienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverlustWehrUndZivildienst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommensverlustWehrUndZivildienst() <em>Einkommensverlust Wehr Und Zivildienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverlustWehrUndZivildienst()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverlustWehrUndZivildienst = EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST_EDEFAULT;

	/**
	 * This is true if the Einkommensverlust Wehr Und Zivildienst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverlustWehrUndZivildienstESet;

	/**
	 * The cached value of the '{@link #getNachweisEinkommensverlustWehrUndZivildienst() <em>Nachweis Einkommensverlust Wehr Und Zivildienst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEinkommensverlustWehrUndZivildienst()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisEinkommensverlustWehrUndZivildienst;

	/**
	 * The default value of the '{@link #isAntragAusklammerungsverzicht() <em>Antrag Ausklammerungsverzicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAusklammerungsverzicht()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTRAG_AUSKLAMMERUNGSVERZICHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntragAusklammerungsverzicht() <em>Antrag Ausklammerungsverzicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAusklammerungsverzicht()
	 * @generated
	 * @ordered
	 */
	protected boolean antragAusklammerungsverzicht = ANTRAG_AUSKLAMMERUNGSVERZICHT_EDEFAULT;

	/**
	 * This is true if the Antrag Ausklammerungsverzicht attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antragAusklammerungsverzichtESet;

	/**
	 * The cached value of the '{@link #getZeitraumAntragAusklammerungsverzicht() <em>Zeitraum Antrag Ausklammerungsverzicht</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumAntragAusklammerungsverzicht()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumAntragAusklammerungsverzicht;

	/**
	 * The default value of the '{@link #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() <em>Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldbezugFuerBesondersFruehGeborenesAelteresKind = ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND_EDEFAULT;

	/**
	 * This is true if the Elterngeldbezug Fuer Besonders Frueh Geborenes Aelteres Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet;

	/**
	 * The cached value of the '{@link #getNachweisAelteresBesondersFruehGeborenesKind() <em>Nachweis Aelteres Besonders Frueh Geborenes Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisAelteresBesondersFruehGeborenesKind()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisAelteresBesondersFruehGeborenesKind;

	/**
	 * The default value of the '{@link #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung() <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung() <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverlustDurchSchwangerschaftsbedingteErkrankung = EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_EDEFAULT;

	/**
	 * This is true if the Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet;

	/**
	 * The cached value of the '{@link #getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis() <em>Einkommensverlust Durch Schwangerschaftsbedingte Erkrankung Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getNichtselbststaendigkeitAusklammerungstatbestaendeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutterschaftsgeldbezugVorGeburtAntragskind() {
		return mutterschaftsgeldbezugVorGeburtAntragskind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldbezugVorGeburtAntragskind(boolean newMutterschaftsgeldbezugVorGeburtAntragskind) {
		boolean oldMutterschaftsgeldbezugVorGeburtAntragskind = mutterschaftsgeldbezugVorGeburtAntragskind;
		mutterschaftsgeldbezugVorGeburtAntragskind = newMutterschaftsgeldbezugVorGeburtAntragskind;
		boolean oldMutterschaftsgeldbezugVorGeburtAntragskindESet = mutterschaftsgeldbezugVorGeburtAntragskindESet;
		mutterschaftsgeldbezugVorGeburtAntragskindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND, oldMutterschaftsgeldbezugVorGeburtAntragskind, mutterschaftsgeldbezugVorGeburtAntragskind, !oldMutterschaftsgeldbezugVorGeburtAntragskindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMutterschaftsgeldbezugVorGeburtAntragskind() {
		boolean oldMutterschaftsgeldbezugVorGeburtAntragskind = mutterschaftsgeldbezugVorGeburtAntragskind;
		boolean oldMutterschaftsgeldbezugVorGeburtAntragskindESet = mutterschaftsgeldbezugVorGeburtAntragskindESet;
		mutterschaftsgeldbezugVorGeburtAntragskind = MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND_EDEFAULT;
		mutterschaftsgeldbezugVorGeburtAntragskindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND, oldMutterschaftsgeldbezugVorGeburtAntragskind, MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND_EDEFAULT, oldMutterschaftsgeldbezugVorGeburtAntragskindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMutterschaftsgeldbezugVorGeburtAntragskind() {
		return mutterschaftsgeldbezugVorGeburtAntragskindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMutterschaftsgeldbezugAntragskind() {
		if (nachweisMutterschaftsgeldbezugAntragskind == null) {
			nachweisMutterschaftsgeldbezugAntragskind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND);
		}
		return nachweisMutterschaftsgeldbezugAntragskind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutterschaftsgeldbezugVorGeburtaelteresKind() {
		return mutterschaftsgeldbezugVorGeburtaelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldbezugVorGeburtaelteresKind(boolean newMutterschaftsgeldbezugVorGeburtaelteresKind) {
		boolean oldMutterschaftsgeldbezugVorGeburtaelteresKind = mutterschaftsgeldbezugVorGeburtaelteresKind;
		mutterschaftsgeldbezugVorGeburtaelteresKind = newMutterschaftsgeldbezugVorGeburtaelteresKind;
		boolean oldMutterschaftsgeldbezugVorGeburtaelteresKindESet = mutterschaftsgeldbezugVorGeburtaelteresKindESet;
		mutterschaftsgeldbezugVorGeburtaelteresKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND, oldMutterschaftsgeldbezugVorGeburtaelteresKind, mutterschaftsgeldbezugVorGeburtaelteresKind, !oldMutterschaftsgeldbezugVorGeburtaelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMutterschaftsgeldbezugVorGeburtaelteresKind() {
		boolean oldMutterschaftsgeldbezugVorGeburtaelteresKind = mutterschaftsgeldbezugVorGeburtaelteresKind;
		boolean oldMutterschaftsgeldbezugVorGeburtaelteresKindESet = mutterschaftsgeldbezugVorGeburtaelteresKindESet;
		mutterschaftsgeldbezugVorGeburtaelteresKind = MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND_EDEFAULT;
		mutterschaftsgeldbezugVorGeburtaelteresKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND, oldMutterschaftsgeldbezugVorGeburtaelteresKind, MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND_EDEFAULT, oldMutterschaftsgeldbezugVorGeburtaelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMutterschaftsgeldbezugVorGeburtaelteresKind() {
		return mutterschaftsgeldbezugVorGeburtaelteresKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMutterschaftsgeldbezugAelteresKind() {
		if (nachweisMutterschaftsgeldbezugAelteresKind == null) {
			nachweisMutterschaftsgeldbezugAelteresKind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND);
		}
		return nachweisMutterschaftsgeldbezugAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElterngeldbezugAelteresKind() {
		return elterngeldbezugAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldbezugAelteresKind(boolean newElterngeldbezugAelteresKind) {
		boolean oldElterngeldbezugAelteresKind = elterngeldbezugAelteresKind;
		elterngeldbezugAelteresKind = newElterngeldbezugAelteresKind;
		boolean oldElterngeldbezugAelteresKindESet = elterngeldbezugAelteresKindESet;
		elterngeldbezugAelteresKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND, oldElterngeldbezugAelteresKind, elterngeldbezugAelteresKind, !oldElterngeldbezugAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElterngeldbezugAelteresKind() {
		boolean oldElterngeldbezugAelteresKind = elterngeldbezugAelteresKind;
		boolean oldElterngeldbezugAelteresKindESet = elterngeldbezugAelteresKindESet;
		elterngeldbezugAelteresKind = ELTERNGELDBEZUG_AELTERES_KIND_EDEFAULT;
		elterngeldbezugAelteresKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND, oldElterngeldbezugAelteresKind, ELTERNGELDBEZUG_AELTERES_KIND_EDEFAULT, oldElterngeldbezugAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElterngeldbezugAelteresKind() {
		return elterngeldbezugAelteresKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisElterngeldbezugAelteresKind() {
		if (nachweisElterngeldbezugAelteresKind == null) {
			nachweisElterngeldbezugAelteresKind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND);
		}
		return nachweisElterngeldbezugAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMoeglicheEinkommensverluste() {
		return moeglicheEinkommensverluste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoeglicheEinkommensverluste(boolean newMoeglicheEinkommensverluste) {
		boolean oldMoeglicheEinkommensverluste = moeglicheEinkommensverluste;
		moeglicheEinkommensverluste = newMoeglicheEinkommensverluste;
		boolean oldMoeglicheEinkommensverlusteESet = moeglicheEinkommensverlusteESet;
		moeglicheEinkommensverlusteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE, oldMoeglicheEinkommensverluste, moeglicheEinkommensverluste, !oldMoeglicheEinkommensverlusteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMoeglicheEinkommensverluste() {
		boolean oldMoeglicheEinkommensverluste = moeglicheEinkommensverluste;
		boolean oldMoeglicheEinkommensverlusteESet = moeglicheEinkommensverlusteESet;
		moeglicheEinkommensverluste = MOEGLICHE_EINKOMMENSVERLUSTE_EDEFAULT;
		moeglicheEinkommensverlusteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE, oldMoeglicheEinkommensverluste, MOEGLICHE_EINKOMMENSVERLUSTE_EDEFAULT, oldMoeglicheEinkommensverlusteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMoeglicheEinkommensverluste() {
		return moeglicheEinkommensverlusteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMoeglicheEinkommensverluste() {
		if (nachweisMoeglicheEinkommensverluste == null) {
			nachweisMoeglicheEinkommensverluste = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE);
		}
		return nachweisMoeglicheEinkommensverluste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommensverlustWehrUndZivildienst() {
		return einkommensverlustWehrUndZivildienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensverlustWehrUndZivildienst(boolean newEinkommensverlustWehrUndZivildienst) {
		boolean oldEinkommensverlustWehrUndZivildienst = einkommensverlustWehrUndZivildienst;
		einkommensverlustWehrUndZivildienst = newEinkommensverlustWehrUndZivildienst;
		boolean oldEinkommensverlustWehrUndZivildienstESet = einkommensverlustWehrUndZivildienstESet;
		einkommensverlustWehrUndZivildienstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST, oldEinkommensverlustWehrUndZivildienst, einkommensverlustWehrUndZivildienst, !oldEinkommensverlustWehrUndZivildienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommensverlustWehrUndZivildienst() {
		boolean oldEinkommensverlustWehrUndZivildienst = einkommensverlustWehrUndZivildienst;
		boolean oldEinkommensverlustWehrUndZivildienstESet = einkommensverlustWehrUndZivildienstESet;
		einkommensverlustWehrUndZivildienst = EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST_EDEFAULT;
		einkommensverlustWehrUndZivildienstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST, oldEinkommensverlustWehrUndZivildienst, EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST_EDEFAULT, oldEinkommensverlustWehrUndZivildienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommensverlustWehrUndZivildienst() {
		return einkommensverlustWehrUndZivildienstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisEinkommensverlustWehrUndZivildienst() {
		if (nachweisEinkommensverlustWehrUndZivildienst == null) {
			nachweisEinkommensverlustWehrUndZivildienst = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST);
		}
		return nachweisEinkommensverlustWehrUndZivildienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAntragAusklammerungsverzicht() {
		return antragAusklammerungsverzicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragAusklammerungsverzicht(boolean newAntragAusklammerungsverzicht) {
		boolean oldAntragAusklammerungsverzicht = antragAusklammerungsverzicht;
		antragAusklammerungsverzicht = newAntragAusklammerungsverzicht;
		boolean oldAntragAusklammerungsverzichtESet = antragAusklammerungsverzichtESet;
		antragAusklammerungsverzichtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT, oldAntragAusklammerungsverzicht, antragAusklammerungsverzicht, !oldAntragAusklammerungsverzichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAntragAusklammerungsverzicht() {
		boolean oldAntragAusklammerungsverzicht = antragAusklammerungsverzicht;
		boolean oldAntragAusklammerungsverzichtESet = antragAusklammerungsverzichtESet;
		antragAusklammerungsverzicht = ANTRAG_AUSKLAMMERUNGSVERZICHT_EDEFAULT;
		antragAusklammerungsverzichtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT, oldAntragAusklammerungsverzicht, ANTRAG_AUSKLAMMERUNGSVERZICHT_EDEFAULT, oldAntragAusklammerungsverzichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAntragAusklammerungsverzicht() {
		return antragAusklammerungsverzichtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumAntragAusklammerungsverzicht() {
		if (zeitraumAntragAusklammerungsverzicht == null) {
			zeitraumAntragAusklammerungsverzicht = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT);
		}
		return zeitraumAntragAusklammerungsverzicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() {
		return elterngeldbezugFuerBesondersFruehGeborenesAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind(boolean newElterngeldbezugFuerBesondersFruehGeborenesAelteresKind) {
		boolean oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKind = elterngeldbezugFuerBesondersFruehGeborenesAelteresKind;
		elterngeldbezugFuerBesondersFruehGeborenesAelteresKind = newElterngeldbezugFuerBesondersFruehGeborenesAelteresKind;
		boolean oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet = elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet;
		elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND, oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKind, elterngeldbezugFuerBesondersFruehGeborenesAelteresKind, !oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() {
		boolean oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKind = elterngeldbezugFuerBesondersFruehGeborenesAelteresKind;
		boolean oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet = elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet;
		elterngeldbezugFuerBesondersFruehGeborenesAelteresKind = ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND_EDEFAULT;
		elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND, oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKind, ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND_EDEFAULT, oldElterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind() {
		return elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisAelteresBesondersFruehGeborenesKind() {
		if (nachweisAelteresBesondersFruehGeborenesKind == null) {
			nachweisAelteresBesondersFruehGeborenesKind = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND);
		}
		return nachweisAelteresBesondersFruehGeborenesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung() {
		return einkommensverlustDurchSchwangerschaftsbedingteErkrankung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung(boolean newEinkommensverlustDurchSchwangerschaftsbedingteErkrankung) {
		boolean oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankung = einkommensverlustDurchSchwangerschaftsbedingteErkrankung;
		einkommensverlustDurchSchwangerschaftsbedingteErkrankung = newEinkommensverlustDurchSchwangerschaftsbedingteErkrankung;
		boolean oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankungESet = einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet;
		einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG, oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankung, einkommensverlustDurchSchwangerschaftsbedingteErkrankung, !oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung() {
		boolean oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankung = einkommensverlustDurchSchwangerschaftsbedingteErkrankung;
		boolean oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankungESet = einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet;
		einkommensverlustDurchSchwangerschaftsbedingteErkrankung = EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_EDEFAULT;
		einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG, oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankung, EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_EDEFAULT, oldEinkommensverlustDurchSchwangerschaftsbedingteErkrankungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung() {
		return einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis() {
		if (einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis == null) {
			einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis = new EDataTypeEList<Boolean>(Boolean.class, this, ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS);
		}
		return einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND:
				return ((InternalEList<?>)getNachweisMutterschaftsgeldbezugAntragskind()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND:
				return ((InternalEList<?>)getNachweisMutterschaftsgeldbezugAelteresKind()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND:
				return ((InternalEList<?>)getNachweisElterngeldbezugAelteresKind()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE:
				return ((InternalEList<?>)getNachweisMoeglicheEinkommensverluste()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				return ((InternalEList<?>)getNachweisEinkommensverlustWehrUndZivildienst()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT:
				return ((InternalEList<?>)getZeitraumAntragAusklammerungsverzicht()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND:
				return ((InternalEList<?>)getNachweisAelteresBesondersFruehGeborenesKind()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND:
				return isMutterschaftsgeldbezugVorGeburtAntragskind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND:
				return getNachweisMutterschaftsgeldbezugAntragskind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND:
				return isMutterschaftsgeldbezugVorGeburtaelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND:
				return getNachweisMutterschaftsgeldbezugAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND:
				return isElterngeldbezugAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND:
				return getNachweisElterngeldbezugAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE:
				return isMoeglicheEinkommensverluste();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE:
				return getNachweisMoeglicheEinkommensverluste();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				return isEinkommensverlustWehrUndZivildienst();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				return getNachweisEinkommensverlustWehrUndZivildienst();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT:
				return isAntragAusklammerungsverzicht();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT:
				return getZeitraumAntragAusklammerungsverzicht();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND:
				return isElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND:
				return getNachweisAelteresBesondersFruehGeborenesKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG:
				return isEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS:
				return getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis();
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND:
				setMutterschaftsgeldbezugVorGeburtAntragskind((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND:
				getNachweisMutterschaftsgeldbezugAntragskind().clear();
				getNachweisMutterschaftsgeldbezugAntragskind().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND:
				setMutterschaftsgeldbezugVorGeburtaelteresKind((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND:
				getNachweisMutterschaftsgeldbezugAelteresKind().clear();
				getNachweisMutterschaftsgeldbezugAelteresKind().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND:
				setElterngeldbezugAelteresKind((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND:
				getNachweisElterngeldbezugAelteresKind().clear();
				getNachweisElterngeldbezugAelteresKind().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE:
				setMoeglicheEinkommensverluste((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE:
				getNachweisMoeglicheEinkommensverluste().clear();
				getNachweisMoeglicheEinkommensverluste().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				setEinkommensverlustWehrUndZivildienst((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				getNachweisEinkommensverlustWehrUndZivildienst().clear();
				getNachweisEinkommensverlustWehrUndZivildienst().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT:
				setAntragAusklammerungsverzicht((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT:
				getZeitraumAntragAusklammerungsverzicht().clear();
				getZeitraumAntragAusklammerungsverzicht().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND:
				setElterngeldbezugFuerBesondersFruehGeborenesAelteresKind((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND:
				getNachweisAelteresBesondersFruehGeborenesKind().clear();
				getNachweisAelteresBesondersFruehGeborenesKind().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG:
				setEinkommensverlustDurchSchwangerschaftsbedingteErkrankung((Boolean)newValue);
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS:
				getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis().clear();
				getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis().addAll((Collection<? extends Boolean>)newValue);
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND:
				unsetMutterschaftsgeldbezugVorGeburtAntragskind();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND:
				getNachweisMutterschaftsgeldbezugAntragskind().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND:
				unsetMutterschaftsgeldbezugVorGeburtaelteresKind();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND:
				getNachweisMutterschaftsgeldbezugAelteresKind().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND:
				unsetElterngeldbezugAelteresKind();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND:
				getNachweisElterngeldbezugAelteresKind().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE:
				unsetMoeglicheEinkommensverluste();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE:
				getNachweisMoeglicheEinkommensverluste().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				unsetEinkommensverlustWehrUndZivildienst();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				getNachweisEinkommensverlustWehrUndZivildienst().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT:
				unsetAntragAusklammerungsverzicht();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT:
				getZeitraumAntragAusklammerungsverzicht().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND:
				unsetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND:
				getNachweisAelteresBesondersFruehGeborenesKind().clear();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG:
				unsetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();
				return;
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS:
				getEinkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis().clear();
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
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURT_ANTRAGSKIND:
				return isSetMutterschaftsgeldbezugVorGeburtAntragskind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_ANTRAGSKIND:
				return nachweisMutterschaftsgeldbezugAntragskind != null && !nachweisMutterschaftsgeldbezugAntragskind.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MUTTERSCHAFTSGELDBEZUG_VOR_GEBURTAELTERES_KIND:
				return isSetMutterschaftsgeldbezugVorGeburtaelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MUTTERSCHAFTSGELDBEZUG_AELTERES_KIND:
				return nachweisMutterschaftsgeldbezugAelteresKind != null && !nachweisMutterschaftsgeldbezugAelteresKind.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_AELTERES_KIND:
				return isSetElterngeldbezugAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_ELTERNGELDBEZUG_AELTERES_KIND:
				return nachweisElterngeldbezugAelteresKind != null && !nachweisElterngeldbezugAelteresKind.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__MOEGLICHE_EINKOMMENSVERLUSTE:
				return isSetMoeglicheEinkommensverluste();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_MOEGLICHE_EINKOMMENSVERLUSTE:
				return nachweisMoeglicheEinkommensverluste != null && !nachweisMoeglicheEinkommensverluste.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				return isSetEinkommensverlustWehrUndZivildienst();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_EINKOMMENSVERLUST_WEHR_UND_ZIVILDIENST:
				return nachweisEinkommensverlustWehrUndZivildienst != null && !nachweisEinkommensverlustWehrUndZivildienst.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ANTRAG_AUSKLAMMERUNGSVERZICHT:
				return isSetAntragAusklammerungsverzicht();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ZEITRAUM_ANTRAG_AUSKLAMMERUNGSVERZICHT:
				return zeitraumAntragAusklammerungsverzicht != null && !zeitraumAntragAusklammerungsverzicht.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__ELTERNGELDBEZUG_FUER_BESONDERS_FRUEH_GEBORENES_AELTERES_KIND:
				return isSetElterngeldbezugFuerBesondersFruehGeborenesAelteresKind();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__NACHWEIS_AELTERES_BESONDERS_FRUEH_GEBORENES_KIND:
				return nachweisAelteresBesondersFruehGeborenesKind != null && !nachweisAelteresBesondersFruehGeborenesKind.isEmpty();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG:
				return isSetEinkommensverlustDurchSchwangerschaftsbedingteErkrankung();
			case ElterngeldPackage.NICHTSELBSTSTAENDIGKEIT_AUSKLAMMERUNGSTATBESTAENDE_TYPE__EINKOMMENSVERLUST_DURCH_SCHWANGERSCHAFTSBEDINGTE_ERKRANKUNG_NACHWEIS:
				return einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis != null && !einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis.isEmpty();
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
		result.append(" (mutterschaftsgeldbezugVorGeburtAntragskind: ");
		if (mutterschaftsgeldbezugVorGeburtAntragskindESet) result.append(mutterschaftsgeldbezugVorGeburtAntragskind); else result.append("<unset>");
		result.append(", mutterschaftsgeldbezugVorGeburtaelteresKind: ");
		if (mutterschaftsgeldbezugVorGeburtaelteresKindESet) result.append(mutterschaftsgeldbezugVorGeburtaelteresKind); else result.append("<unset>");
		result.append(", elterngeldbezugAelteresKind: ");
		if (elterngeldbezugAelteresKindESet) result.append(elterngeldbezugAelteresKind); else result.append("<unset>");
		result.append(", moeglicheEinkommensverluste: ");
		if (moeglicheEinkommensverlusteESet) result.append(moeglicheEinkommensverluste); else result.append("<unset>");
		result.append(", einkommensverlustWehrUndZivildienst: ");
		if (einkommensverlustWehrUndZivildienstESet) result.append(einkommensverlustWehrUndZivildienst); else result.append("<unset>");
		result.append(", antragAusklammerungsverzicht: ");
		if (antragAusklammerungsverzichtESet) result.append(antragAusklammerungsverzicht); else result.append("<unset>");
		result.append(", elterngeldbezugFuerBesondersFruehGeborenesAelteresKind: ");
		if (elterngeldbezugFuerBesondersFruehGeborenesAelteresKindESet) result.append(elterngeldbezugFuerBesondersFruehGeborenesAelteresKind); else result.append("<unset>");
		result.append(", einkommensverlustDurchSchwangerschaftsbedingteErkrankung: ");
		if (einkommensverlustDurchSchwangerschaftsbedingteErkrankungESet) result.append(einkommensverlustDurchSchwangerschaftsbedingteErkrankung); else result.append("<unset>");
		result.append(", einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis: ");
		result.append(einkommensverlustDurchSchwangerschaftsbedingteErkrankungNachweis);
		result.append(')');
		return result.toString();
	}

} //NichtselbststaendigkeitAusklammerungstatbestaendeTypeImpl
