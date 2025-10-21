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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType;

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
 * An implementation of the model object '<em><b>Mutterschaftsgeld Arbeitgeberzuschuss Vergleichbare Leistungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isMutterschaftsgeld <em>Mutterschaftsgeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getMutterschaftsgeldZeitraum <em>Mutterschaftsgeld Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getMutterschaftsgeldNachweis <em>Mutterschaftsgeld Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isArbeitgeberzuschuss <em>Arbeitgeberzuschuss</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getArbeitgeberzuschussZeitraum <em>Arbeitgeberzuschuss Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getArbeitgeberzuschussNachweis <em>Arbeitgeberzuschuss Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isKrankentagegeld <em>Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getKrankentagegeldZeitraum <em>Krankentagegeld Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getKrankentagegeldNachweis <em>Krankentagegeld Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isDienstAnwaerterbezug <em>Dienst Anwaerterbezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getDienstAnwaerterbezugZeitraum <em>Dienst Anwaerterbezug Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getDienstAnwaerterbezugNachweis <em>Dienst Anwaerterbezug Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isBeamtenSoldatenrecht <em>Beamten Soldatenrecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getBeamtenSoldatenrechtZeitraum <em>Beamten Soldatenrecht Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getBeamtenSodatenrechtNachweis <em>Beamten Sodatenrecht Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#isAuslFamilienleistungen <em>Ausl Familienleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getAuslFamilienleistungenZeitraum <em>Ausl Familienleistungen Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl#getAuslFamilienleistungenNachweis <em>Ausl Familienleistungen Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl extends MinimalEObjectImpl.Container implements MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType {
	/**
	 * The default value of the '{@link #isMutterschaftsgeld() <em>Mutterschaftsgeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTTERSCHAFTSGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutterschaftsgeld() <em>Mutterschaftsgeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterschaftsgeld()
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeld = MUTTERSCHAFTSGELD_EDEFAULT;

	/**
	 * This is true if the Mutterschaftsgeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutterschaftsgeldESet;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldZeitraum() <em>Mutterschaftsgeld Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> mutterschaftsgeldZeitraum;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldNachweis() <em>Mutterschaftsgeld Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> mutterschaftsgeldNachweis;

	/**
	 * The default value of the '{@link #isArbeitgeberzuschuss() <em>Arbeitgeberzuschuss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArbeitgeberzuschuss()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARBEITGEBERZUSCHUSS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArbeitgeberzuschuss() <em>Arbeitgeberzuschuss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArbeitgeberzuschuss()
	 * @generated
	 * @ordered
	 */
	protected boolean arbeitgeberzuschuss = ARBEITGEBERZUSCHUSS_EDEFAULT;

	/**
	 * This is true if the Arbeitgeberzuschuss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arbeitgeberzuschussESet;

	/**
	 * The cached value of the '{@link #getArbeitgeberzuschussZeitraum() <em>Arbeitgeberzuschuss Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitgeberzuschussZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> arbeitgeberzuschussZeitraum;

	/**
	 * The cached value of the '{@link #getArbeitgeberzuschussNachweis() <em>Arbeitgeberzuschuss Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitgeberzuschussNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> arbeitgeberzuschussNachweis;

	/**
	 * The default value of the '{@link #isKrankentagegeld() <em>Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KRANKENTAGEGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKrankentagegeld() <em>Krankentagegeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected boolean krankentagegeld = KRANKENTAGEGELD_EDEFAULT;

	/**
	 * This is true if the Krankentagegeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean krankentagegeldESet;

	/**
	 * The cached value of the '{@link #getKrankentagegeldZeitraum() <em>Krankentagegeld Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankentagegeldZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> krankentagegeldZeitraum;

	/**
	 * The cached value of the '{@link #getKrankentagegeldNachweis() <em>Krankentagegeld Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankentagegeldNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> krankentagegeldNachweis;

	/**
	 * The default value of the '{@link #isDienstAnwaerterbezug() <em>Dienst Anwaerterbezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDienstAnwaerterbezug()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIENST_ANWAERTERBEZUG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDienstAnwaerterbezug() <em>Dienst Anwaerterbezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDienstAnwaerterbezug()
	 * @generated
	 * @ordered
	 */
	protected boolean dienstAnwaerterbezug = DIENST_ANWAERTERBEZUG_EDEFAULT;

	/**
	 * This is true if the Dienst Anwaerterbezug attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dienstAnwaerterbezugESet;

	/**
	 * The cached value of the '{@link #getDienstAnwaerterbezugZeitraum() <em>Dienst Anwaerterbezug Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDienstAnwaerterbezugZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> dienstAnwaerterbezugZeitraum;

	/**
	 * The cached value of the '{@link #getDienstAnwaerterbezugNachweis() <em>Dienst Anwaerterbezug Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDienstAnwaerterbezugNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> dienstAnwaerterbezugNachweis;

	/**
	 * The default value of the '{@link #isBeamtenSoldatenrecht() <em>Beamten Soldatenrecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeamtenSoldatenrecht()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEAMTEN_SOLDATENRECHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeamtenSoldatenrecht() <em>Beamten Soldatenrecht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeamtenSoldatenrecht()
	 * @generated
	 * @ordered
	 */
	protected boolean beamtenSoldatenrecht = BEAMTEN_SOLDATENRECHT_EDEFAULT;

	/**
	 * This is true if the Beamten Soldatenrecht attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beamtenSoldatenrechtESet;

	/**
	 * The cached value of the '{@link #getBeamtenSoldatenrechtZeitraum() <em>Beamten Soldatenrecht Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamtenSoldatenrechtZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> beamtenSoldatenrechtZeitraum;

	/**
	 * The cached value of the '{@link #getBeamtenSodatenrechtNachweis() <em>Beamten Sodatenrecht Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamtenSodatenrechtNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> beamtenSodatenrechtNachweis;

	/**
	 * The default value of the '{@link #isAuslFamilienleistungen() <em>Ausl Familienleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslFamilienleistungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUSL_FAMILIENLEISTUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuslFamilienleistungen() <em>Ausl Familienleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslFamilienleistungen()
	 * @generated
	 * @ordered
	 */
	protected boolean auslFamilienleistungen = AUSL_FAMILIENLEISTUNGEN_EDEFAULT;

	/**
	 * This is true if the Ausl Familienleistungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auslFamilienleistungenESet;

	/**
	 * The cached value of the '{@link #getAuslFamilienleistungenZeitraum() <em>Ausl Familienleistungen Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuslFamilienleistungenZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> auslFamilienleistungenZeitraum;

	/**
	 * The cached value of the '{@link #getAuslFamilienleistungenNachweis() <em>Ausl Familienleistungen Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuslFamilienleistungenNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> auslFamilienleistungenNachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getMutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutterschaftsgeld() {
		return mutterschaftsgeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeld(boolean newMutterschaftsgeld) {
		boolean oldMutterschaftsgeld = mutterschaftsgeld;
		mutterschaftsgeld = newMutterschaftsgeld;
		boolean oldMutterschaftsgeldESet = mutterschaftsgeldESet;
		mutterschaftsgeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD, oldMutterschaftsgeld, mutterschaftsgeld, !oldMutterschaftsgeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMutterschaftsgeld() {
		boolean oldMutterschaftsgeld = mutterschaftsgeld;
		boolean oldMutterschaftsgeldESet = mutterschaftsgeldESet;
		mutterschaftsgeld = MUTTERSCHAFTSGELD_EDEFAULT;
		mutterschaftsgeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD, oldMutterschaftsgeld, MUTTERSCHAFTSGELD_EDEFAULT, oldMutterschaftsgeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMutterschaftsgeld() {
		return mutterschaftsgeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getMutterschaftsgeldZeitraum() {
		if (mutterschaftsgeldZeitraum == null) {
			mutterschaftsgeldZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM);
		}
		return mutterschaftsgeldZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getMutterschaftsgeldNachweis() {
		if (mutterschaftsgeldNachweis == null) {
			mutterschaftsgeldNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS);
		}
		return mutterschaftsgeldNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArbeitgeberzuschuss() {
		return arbeitgeberzuschuss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArbeitgeberzuschuss(boolean newArbeitgeberzuschuss) {
		boolean oldArbeitgeberzuschuss = arbeitgeberzuschuss;
		arbeitgeberzuschuss = newArbeitgeberzuschuss;
		boolean oldArbeitgeberzuschussESet = arbeitgeberzuschussESet;
		arbeitgeberzuschussESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS, oldArbeitgeberzuschuss, arbeitgeberzuschuss, !oldArbeitgeberzuschussESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArbeitgeberzuschuss() {
		boolean oldArbeitgeberzuschuss = arbeitgeberzuschuss;
		boolean oldArbeitgeberzuschussESet = arbeitgeberzuschussESet;
		arbeitgeberzuschuss = ARBEITGEBERZUSCHUSS_EDEFAULT;
		arbeitgeberzuschussESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS, oldArbeitgeberzuschuss, ARBEITGEBERZUSCHUSS_EDEFAULT, oldArbeitgeberzuschussESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArbeitgeberzuschuss() {
		return arbeitgeberzuschussESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getArbeitgeberzuschussZeitraum() {
		if (arbeitgeberzuschussZeitraum == null) {
			arbeitgeberzuschussZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM);
		}
		return arbeitgeberzuschussZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getArbeitgeberzuschussNachweis() {
		if (arbeitgeberzuschussNachweis == null) {
			arbeitgeberzuschussNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS);
		}
		return arbeitgeberzuschussNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKrankentagegeld() {
		return krankentagegeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKrankentagegeld(boolean newKrankentagegeld) {
		boolean oldKrankentagegeld = krankentagegeld;
		krankentagegeld = newKrankentagegeld;
		boolean oldKrankentagegeldESet = krankentagegeldESet;
		krankentagegeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD, oldKrankentagegeld, krankentagegeld, !oldKrankentagegeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKrankentagegeld() {
		boolean oldKrankentagegeld = krankentagegeld;
		boolean oldKrankentagegeldESet = krankentagegeldESet;
		krankentagegeld = KRANKENTAGEGELD_EDEFAULT;
		krankentagegeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD, oldKrankentagegeld, KRANKENTAGEGELD_EDEFAULT, oldKrankentagegeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKrankentagegeld() {
		return krankentagegeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getKrankentagegeldZeitraum() {
		if (krankentagegeldZeitraum == null) {
			krankentagegeldZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM);
		}
		return krankentagegeldZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getKrankentagegeldNachweis() {
		if (krankentagegeldNachweis == null) {
			krankentagegeldNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS);
		}
		return krankentagegeldNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDienstAnwaerterbezug() {
		return dienstAnwaerterbezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDienstAnwaerterbezug(boolean newDienstAnwaerterbezug) {
		boolean oldDienstAnwaerterbezug = dienstAnwaerterbezug;
		dienstAnwaerterbezug = newDienstAnwaerterbezug;
		boolean oldDienstAnwaerterbezugESet = dienstAnwaerterbezugESet;
		dienstAnwaerterbezugESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG, oldDienstAnwaerterbezug, dienstAnwaerterbezug, !oldDienstAnwaerterbezugESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDienstAnwaerterbezug() {
		boolean oldDienstAnwaerterbezug = dienstAnwaerterbezug;
		boolean oldDienstAnwaerterbezugESet = dienstAnwaerterbezugESet;
		dienstAnwaerterbezug = DIENST_ANWAERTERBEZUG_EDEFAULT;
		dienstAnwaerterbezugESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG, oldDienstAnwaerterbezug, DIENST_ANWAERTERBEZUG_EDEFAULT, oldDienstAnwaerterbezugESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDienstAnwaerterbezug() {
		return dienstAnwaerterbezugESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getDienstAnwaerterbezugZeitraum() {
		if (dienstAnwaerterbezugZeitraum == null) {
			dienstAnwaerterbezugZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM);
		}
		return dienstAnwaerterbezugZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getDienstAnwaerterbezugNachweis() {
		if (dienstAnwaerterbezugNachweis == null) {
			dienstAnwaerterbezugNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS);
		}
		return dienstAnwaerterbezugNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeamtenSoldatenrecht() {
		return beamtenSoldatenrecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeamtenSoldatenrecht(boolean newBeamtenSoldatenrecht) {
		boolean oldBeamtenSoldatenrecht = beamtenSoldatenrecht;
		beamtenSoldatenrecht = newBeamtenSoldatenrecht;
		boolean oldBeamtenSoldatenrechtESet = beamtenSoldatenrechtESet;
		beamtenSoldatenrechtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT, oldBeamtenSoldatenrecht, beamtenSoldatenrecht, !oldBeamtenSoldatenrechtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeamtenSoldatenrecht() {
		boolean oldBeamtenSoldatenrecht = beamtenSoldatenrecht;
		boolean oldBeamtenSoldatenrechtESet = beamtenSoldatenrechtESet;
		beamtenSoldatenrecht = BEAMTEN_SOLDATENRECHT_EDEFAULT;
		beamtenSoldatenrechtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT, oldBeamtenSoldatenrecht, BEAMTEN_SOLDATENRECHT_EDEFAULT, oldBeamtenSoldatenrechtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeamtenSoldatenrecht() {
		return beamtenSoldatenrechtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getBeamtenSoldatenrechtZeitraum() {
		if (beamtenSoldatenrechtZeitraum == null) {
			beamtenSoldatenrechtZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM);
		}
		return beamtenSoldatenrechtZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getBeamtenSodatenrechtNachweis() {
		if (beamtenSodatenrechtNachweis == null) {
			beamtenSodatenrechtNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS);
		}
		return beamtenSodatenrechtNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuslFamilienleistungen() {
		return auslFamilienleistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuslFamilienleistungen(boolean newAuslFamilienleistungen) {
		boolean oldAuslFamilienleistungen = auslFamilienleistungen;
		auslFamilienleistungen = newAuslFamilienleistungen;
		boolean oldAuslFamilienleistungenESet = auslFamilienleistungenESet;
		auslFamilienleistungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN, oldAuslFamilienleistungen, auslFamilienleistungen, !oldAuslFamilienleistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuslFamilienleistungen() {
		boolean oldAuslFamilienleistungen = auslFamilienleistungen;
		boolean oldAuslFamilienleistungenESet = auslFamilienleistungenESet;
		auslFamilienleistungen = AUSL_FAMILIENLEISTUNGEN_EDEFAULT;
		auslFamilienleistungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN, oldAuslFamilienleistungen, AUSL_FAMILIENLEISTUNGEN_EDEFAULT, oldAuslFamilienleistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuslFamilienleistungen() {
		return auslFamilienleistungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getAuslFamilienleistungenZeitraum() {
		if (auslFamilienleistungenZeitraum == null) {
			auslFamilienleistungenZeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM);
		}
		return auslFamilienleistungenZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getAuslFamilienleistungenNachweis() {
		if (auslFamilienleistungenNachweis == null) {
			auslFamilienleistungenNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS);
		}
		return auslFamilienleistungenNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM:
				return ((InternalEList<?>)getMutterschaftsgeldZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS:
				return ((InternalEList<?>)getMutterschaftsgeldNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM:
				return ((InternalEList<?>)getArbeitgeberzuschussZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS:
				return ((InternalEList<?>)getArbeitgeberzuschussNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM:
				return ((InternalEList<?>)getKrankentagegeldZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS:
				return ((InternalEList<?>)getKrankentagegeldNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM:
				return ((InternalEList<?>)getDienstAnwaerterbezugZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS:
				return ((InternalEList<?>)getDienstAnwaerterbezugNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM:
				return ((InternalEList<?>)getBeamtenSoldatenrechtZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS:
				return ((InternalEList<?>)getBeamtenSodatenrechtNachweis()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM:
				return ((InternalEList<?>)getAuslFamilienleistungenZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS:
				return ((InternalEList<?>)getAuslFamilienleistungenNachweis()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD:
				return isMutterschaftsgeld();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM:
				return getMutterschaftsgeldZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS:
				return getMutterschaftsgeldNachweis();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS:
				return isArbeitgeberzuschuss();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM:
				return getArbeitgeberzuschussZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS:
				return getArbeitgeberzuschussNachweis();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD:
				return isKrankentagegeld();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM:
				return getKrankentagegeldZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS:
				return getKrankentagegeldNachweis();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG:
				return isDienstAnwaerterbezug();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM:
				return getDienstAnwaerterbezugZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS:
				return getDienstAnwaerterbezugNachweis();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT:
				return isBeamtenSoldatenrecht();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM:
				return getBeamtenSoldatenrechtZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS:
				return getBeamtenSodatenrechtNachweis();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN:
				return isAuslFamilienleistungen();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM:
				return getAuslFamilienleistungenZeitraum();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS:
				return getAuslFamilienleistungenNachweis();
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
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD:
				setMutterschaftsgeld((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM:
				getMutterschaftsgeldZeitraum().clear();
				getMutterschaftsgeldZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS:
				getMutterschaftsgeldNachweis().clear();
				getMutterschaftsgeldNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS:
				setArbeitgeberzuschuss((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM:
				getArbeitgeberzuschussZeitraum().clear();
				getArbeitgeberzuschussZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS:
				getArbeitgeberzuschussNachweis().clear();
				getArbeitgeberzuschussNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD:
				setKrankentagegeld((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM:
				getKrankentagegeldZeitraum().clear();
				getKrankentagegeldZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS:
				getKrankentagegeldNachweis().clear();
				getKrankentagegeldNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG:
				setDienstAnwaerterbezug((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM:
				getDienstAnwaerterbezugZeitraum().clear();
				getDienstAnwaerterbezugZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS:
				getDienstAnwaerterbezugNachweis().clear();
				getDienstAnwaerterbezugNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT:
				setBeamtenSoldatenrecht((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM:
				getBeamtenSoldatenrechtZeitraum().clear();
				getBeamtenSoldatenrechtZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS:
				getBeamtenSodatenrechtNachweis().clear();
				getBeamtenSodatenrechtNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN:
				setAuslFamilienleistungen((Boolean)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM:
				getAuslFamilienleistungenZeitraum().clear();
				getAuslFamilienleistungenZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS:
				getAuslFamilienleistungenNachweis().clear();
				getAuslFamilienleistungenNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD:
				unsetMutterschaftsgeld();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM:
				getMutterschaftsgeldZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS:
				getMutterschaftsgeldNachweis().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS:
				unsetArbeitgeberzuschuss();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM:
				getArbeitgeberzuschussZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS:
				getArbeitgeberzuschussNachweis().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD:
				unsetKrankentagegeld();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM:
				getKrankentagegeldZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS:
				getKrankentagegeldNachweis().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG:
				unsetDienstAnwaerterbezug();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM:
				getDienstAnwaerterbezugZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS:
				getDienstAnwaerterbezugNachweis().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT:
				unsetBeamtenSoldatenrecht();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM:
				getBeamtenSoldatenrechtZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS:
				getBeamtenSodatenrechtNachweis().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN:
				unsetAuslFamilienleistungen();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM:
				getAuslFamilienleistungenZeitraum().clear();
				return;
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS:
				getAuslFamilienleistungenNachweis().clear();
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
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD:
				return isSetMutterschaftsgeld();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_ZEITRAUM:
				return mutterschaftsgeldZeitraum != null && !mutterschaftsgeldZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__MUTTERSCHAFTSGELD_NACHWEIS:
				return mutterschaftsgeldNachweis != null && !mutterschaftsgeldNachweis.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS:
				return isSetArbeitgeberzuschuss();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_ZEITRAUM:
				return arbeitgeberzuschussZeitraum != null && !arbeitgeberzuschussZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__ARBEITGEBERZUSCHUSS_NACHWEIS:
				return arbeitgeberzuschussNachweis != null && !arbeitgeberzuschussNachweis.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD:
				return isSetKrankentagegeld();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_ZEITRAUM:
				return krankentagegeldZeitraum != null && !krankentagegeldZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__KRANKENTAGEGELD_NACHWEIS:
				return krankentagegeldNachweis != null && !krankentagegeldNachweis.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG:
				return isSetDienstAnwaerterbezug();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_ZEITRAUM:
				return dienstAnwaerterbezugZeitraum != null && !dienstAnwaerterbezugZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__DIENST_ANWAERTERBEZUG_NACHWEIS:
				return dienstAnwaerterbezugNachweis != null && !dienstAnwaerterbezugNachweis.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT:
				return isSetBeamtenSoldatenrecht();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SOLDATENRECHT_ZEITRAUM:
				return beamtenSoldatenrechtZeitraum != null && !beamtenSoldatenrechtZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__BEAMTEN_SODATENRECHT_NACHWEIS:
				return beamtenSodatenrechtNachweis != null && !beamtenSodatenrechtNachweis.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN:
				return isSetAuslFamilienleistungen();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_ZEITRAUM:
				return auslFamilienleistungenZeitraum != null && !auslFamilienleistungenZeitraum.isEmpty();
			case ElterngeldPackage.MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VERGLEICHBARE_LEISTUNGEN_TYPE__AUSL_FAMILIENLEISTUNGEN_NACHWEIS:
				return auslFamilienleistungenNachweis != null && !auslFamilienleistungenNachweis.isEmpty();
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
		result.append(" (mutterschaftsgeld: ");
		if (mutterschaftsgeldESet) result.append(mutterschaftsgeld); else result.append("<unset>");
		result.append(", arbeitgeberzuschuss: ");
		if (arbeitgeberzuschussESet) result.append(arbeitgeberzuschuss); else result.append("<unset>");
		result.append(", krankentagegeld: ");
		if (krankentagegeldESet) result.append(krankentagegeld); else result.append("<unset>");
		result.append(", dienstAnwaerterbezug: ");
		if (dienstAnwaerterbezugESet) result.append(dienstAnwaerterbezug); else result.append("<unset>");
		result.append(", beamtenSoldatenrecht: ");
		if (beamtenSoldatenrechtESet) result.append(beamtenSoldatenrecht); else result.append("<unset>");
		result.append(", auslFamilienleistungen: ");
		if (auslFamilienleistungenESet) result.append(auslFamilienleistungen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenTypeImpl
