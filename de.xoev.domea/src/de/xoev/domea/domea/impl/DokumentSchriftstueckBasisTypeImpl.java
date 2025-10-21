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

import de.xoev.domea.domea.AllgemeineMetadatenType;
import de.xoev.domea.domea.AnlageDokumentType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.DokumentSchriftstueckBasisType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeschaeftsgangType;
import de.xoev.domea.domea.HistorienProtokollInformationType;
import de.xoev.domea.domea.IdentifikationObjektType;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.VerweisType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Dokument Schriftstueck Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getIdentifikation <em>Identifikation</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getFremdesGeschaeftszeichen <em>Fremdes Geschaeftszeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getPosteingangsdatum <em>Posteingangsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getPostausgangsdatum <em>Postausgangsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getDatumDesSchreibens <em>Datum Des Schreibens</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getBezug <em>Bezug</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getHier <em>Hier</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getBearbeiter <em>Bearbeiter</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getVerweis <em>Verweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getAnlage <em>Anlage</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getWeitererKontakt <em>Weiterer Kontakt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DokumentSchriftstueckBasisTypeImpl extends MinimalEObjectImpl.Container implements DokumentSchriftstueckBasisType {
	/**
	 * The cached value of the '{@link #getIdentifikation() <em>Identifikation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifikation()
	 * @generated
	 * @ordered
	 */
	protected IdentifikationObjektType identifikation;

	/**
	 * The cached value of the '{@link #getAllgemeineMetadaten() <em>Allgemeine Metadaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineMetadaten()
	 * @generated
	 * @ordered
	 */
	protected AllgemeineMetadatenType allgemeineMetadaten;

	/**
	 * The default value of the '{@link #getFremdesGeschaeftszeichen() <em>Fremdes Geschaeftszeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFremdesGeschaeftszeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String FREMDES_GESCHAEFTSZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFremdesGeschaeftszeichen() <em>Fremdes Geschaeftszeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFremdesGeschaeftszeichen()
	 * @generated
	 * @ordered
	 */
	protected String fremdesGeschaeftszeichen = FREMDES_GESCHAEFTSZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosteingangsdatum() <em>Posteingangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosteingangsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar POSTEINGANGSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosteingangsdatum() <em>Posteingangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosteingangsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar posteingangsdatum = POSTEINGANGSDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostausgangsdatum() <em>Postausgangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostausgangsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar POSTAUSGANGSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostausgangsdatum() <em>Postausgangsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostausgangsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar postausgangsdatum = POSTAUSGANGSDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatumDesSchreibens() <em>Datum Des Schreibens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumDesSchreibens()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATUM_DES_SCHREIBENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatumDesSchreibens() <em>Datum Des Schreibens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumDesSchreibens()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datumDesSchreibens = DATUM_DES_SCHREIBENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBezug() <em>Bezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezug()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezug() <em>Bezug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezug()
	 * @generated
	 * @ordered
	 */
	protected String bezug = BEZUG_EDEFAULT;

	/**
	 * The default value of the '{@link #getHier() <em>Hier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHier()
	 * @generated
	 * @ordered
	 */
	protected static final String HIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHier() <em>Hier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHier()
	 * @generated
	 * @ordered
	 */
	protected String hier = HIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBearbeiter() <em>Bearbeiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeiter()
	 * @generated
	 * @ordered
	 */
	protected static final String BEARBEITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBearbeiter() <em>Bearbeiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeiter()
	 * @generated
	 * @ordered
	 */
	protected String bearbeiter = BEARBEITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHistorienProtokollInformation() <em>Historien Protokoll Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorienProtokollInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<HistorienProtokollInformationType> historienProtokollInformation;

	/**
	 * The cached value of the '{@link #getInternerGeschaeftsgang() <em>Interner Geschaeftsgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternerGeschaeftsgang()
	 * @generated
	 * @ordered
	 */
	protected EList<GeschaeftsgangType> internerGeschaeftsgang;

	/**
	 * The cached value of the '{@link #getVerweis() <em>Verweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerweis()
	 * @generated
	 * @ordered
	 */
	protected EList<VerweisType> verweis;

	/**
	 * The cached value of the '{@link #getAnlage() <em>Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<AnlageDokumentType> anlage;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected EList<KontaktType> autor;

	/**
	 * The cached value of the '{@link #getLeser() <em>Leser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeser()
	 * @generated
	 * @ordered
	 */
	protected EList<KontaktType> leser;

	/**
	 * The cached value of the '{@link #getWeitererKontakt() <em>Weiterer Kontakt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitererKontakt()
	 * @generated
	 * @ordered
	 */
	protected EList<KontaktType> weitererKontakt;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterung() <em>Anwendungsspezifische Erweiterung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<AnwendungsspezifischeErweiterungType> anwendungsspezifischeErweiterung;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterungXML() <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 * @ordered
	 */
	protected AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DokumentSchriftstueckBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationObjektType getIdentifikation() {
		return identifikation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikation(IdentifikationObjektType newIdentifikation, NotificationChain msgs) {
		IdentifikationObjektType oldIdentifikation = identifikation;
		identifikation = newIdentifikation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION, oldIdentifikation, newIdentifikation);
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
	public void setIdentifikation(IdentifikationObjektType newIdentifikation) {
		if (newIdentifikation != identifikation) {
			NotificationChain msgs = null;
			if (identifikation != null)
				msgs = ((InternalEObject)identifikation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION, null, msgs);
			if (newIdentifikation != null)
				msgs = ((InternalEObject)newIdentifikation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION, null, msgs);
			msgs = basicSetIdentifikation(newIdentifikation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION, newIdentifikation, newIdentifikation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineMetadatenType getAllgemeineMetadaten() {
		return allgemeineMetadaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeineMetadaten(AllgemeineMetadatenType newAllgemeineMetadaten, NotificationChain msgs) {
		AllgemeineMetadatenType oldAllgemeineMetadaten = allgemeineMetadaten;
		allgemeineMetadaten = newAllgemeineMetadaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN, oldAllgemeineMetadaten, newAllgemeineMetadaten);
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
	public void setAllgemeineMetadaten(AllgemeineMetadatenType newAllgemeineMetadaten) {
		if (newAllgemeineMetadaten != allgemeineMetadaten) {
			NotificationChain msgs = null;
			if (allgemeineMetadaten != null)
				msgs = ((InternalEObject)allgemeineMetadaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN, null, msgs);
			if (newAllgemeineMetadaten != null)
				msgs = ((InternalEObject)newAllgemeineMetadaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN, null, msgs);
			msgs = basicSetAllgemeineMetadaten(newAllgemeineMetadaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN, newAllgemeineMetadaten, newAllgemeineMetadaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFremdesGeschaeftszeichen() {
		return fremdesGeschaeftszeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFremdesGeschaeftszeichen(String newFremdesGeschaeftszeichen) {
		String oldFremdesGeschaeftszeichen = fremdesGeschaeftszeichen;
		fremdesGeschaeftszeichen = newFremdesGeschaeftszeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN, oldFremdesGeschaeftszeichen, fremdesGeschaeftszeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPosteingangsdatum() {
		return posteingangsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosteingangsdatum(XMLGregorianCalendar newPosteingangsdatum) {
		XMLGregorianCalendar oldPosteingangsdatum = posteingangsdatum;
		posteingangsdatum = newPosteingangsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM, oldPosteingangsdatum, posteingangsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPostausgangsdatum() {
		return postausgangsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostausgangsdatum(XMLGregorianCalendar newPostausgangsdatum) {
		XMLGregorianCalendar oldPostausgangsdatum = postausgangsdatum;
		postausgangsdatum = newPostausgangsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM, oldPostausgangsdatum, postausgangsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDatumDesSchreibens() {
		return datumDesSchreibens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatumDesSchreibens(XMLGregorianCalendar newDatumDesSchreibens) {
		XMLGregorianCalendar oldDatumDesSchreibens = datumDesSchreibens;
		datumDesSchreibens = newDatumDesSchreibens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS, oldDatumDesSchreibens, datumDesSchreibens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBezug() {
		return bezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezug(String newBezug) {
		String oldBezug = bezug;
		bezug = newBezug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG, oldBezug, bezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHier() {
		return hier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHier(String newHier) {
		String oldHier = hier;
		hier = newHier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER, oldHier, hier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBearbeiter() {
		return bearbeiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearbeiter(String newBearbeiter) {
		String oldBearbeiter = bearbeiter;
		bearbeiter = newBearbeiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER, oldBearbeiter, bearbeiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistorienProtokollInformationType> getHistorienProtokollInformation() {
		if (historienProtokollInformation == null) {
			historienProtokollInformation = new EObjectContainmentEList<HistorienProtokollInformationType>(HistorienProtokollInformationType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION);
		}
		return historienProtokollInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeschaeftsgangType> getInternerGeschaeftsgang() {
		if (internerGeschaeftsgang == null) {
			internerGeschaeftsgang = new EObjectContainmentEList<GeschaeftsgangType>(GeschaeftsgangType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG);
		}
		return internerGeschaeftsgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerweisType> getVerweis() {
		if (verweis == null) {
			verweis = new EObjectContainmentEList<VerweisType>(VerweisType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS);
		}
		return verweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnlageDokumentType> getAnlage() {
		if (anlage == null) {
			anlage = new EObjectContainmentEList<AnlageDokumentType>(AnlageDokumentType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE);
		}
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KontaktType> getAutor() {
		if (autor == null) {
			autor = new EObjectContainmentEList<KontaktType>(KontaktType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR);
		}
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KontaktType> getLeser() {
		if (leser == null) {
			leser = new EObjectContainmentEList<KontaktType>(KontaktType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER);
		}
		return leser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KontaktType> getWeitererKontakt() {
		if (weitererKontakt == null) {
			weitererKontakt = new EObjectContainmentEList<KontaktType>(KontaktType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT);
		}
		return weitererKontakt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung() {
		if (anwendungsspezifischeErweiterung == null) {
			anwendungsspezifischeErweiterung = new EObjectContainmentEList<AnwendungsspezifischeErweiterungType>(AnwendungsspezifischeErweiterungType.class, this, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		}
		return anwendungsspezifischeErweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML() {
		return anwendungsspezifischeErweiterungXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML, NotificationChain msgs) {
		AnwendungsspezifischeErweiterungXMLType oldAnwendungsspezifischeErweiterungXML = anwendungsspezifischeErweiterungXML;
		anwendungsspezifischeErweiterungXML = newAnwendungsspezifischeErweiterungXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, oldAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML);
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
	public void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML) {
		if (newAnwendungsspezifischeErweiterungXML != anwendungsspezifischeErweiterungXML) {
			NotificationChain msgs = null;
			if (anwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)anwendungsspezifischeErweiterungXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			if (newAnwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)newAnwendungsspezifischeErweiterungXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			msgs = basicSetAnwendungsspezifischeErweiterungXML(newAnwendungsspezifischeErweiterungXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, newAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION:
				return basicSetIdentifikation(null, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN:
				return basicSetAllgemeineMetadaten(null, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return ((InternalEList<?>)getHistorienProtokollInformation()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG:
				return ((InternalEList<?>)getInternerGeschaeftsgang()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS:
				return ((InternalEList<?>)getVerweis()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE:
				return ((InternalEList<?>)getAnlage()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR:
				return ((InternalEList<?>)getAutor()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER:
				return ((InternalEList<?>)getLeser()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT:
				return ((InternalEList<?>)getWeitererKontakt()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return ((InternalEList<?>)getAnwendungsspezifischeErweiterung()).basicRemove(otherEnd, msgs);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return basicSetAnwendungsspezifischeErweiterungXML(null, msgs);
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
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION:
				return getIdentifikation();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN:
				return getAllgemeineMetadaten();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN:
				return getFremdesGeschaeftszeichen();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM:
				return getPosteingangsdatum();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM:
				return getPostausgangsdatum();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS:
				return getDatumDesSchreibens();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG:
				return getBezug();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER:
				return getHier();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER:
				return getBearbeiter();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP:
				return getTyp();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return getHistorienProtokollInformation();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG:
				return getInternerGeschaeftsgang();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS:
				return getVerweis();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE:
				return getAnlage();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR:
				return getAutor();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER:
				return getLeser();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT:
				return getWeitererKontakt();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return getAnwendungsspezifischeErweiterung();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return getAnwendungsspezifischeErweiterungXML();
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
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN:
				setAllgemeineMetadaten((AllgemeineMetadatenType)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN:
				setFremdesGeschaeftszeichen((String)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM:
				setPosteingangsdatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM:
				setPostausgangsdatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS:
				setDatumDesSchreibens((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG:
				setBezug((String)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER:
				setHier((String)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER:
				setBearbeiter((String)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP:
				setTyp((String)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				getHistorienProtokollInformation().clear();
				getHistorienProtokollInformation().addAll((Collection<? extends HistorienProtokollInformationType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG:
				getInternerGeschaeftsgang().clear();
				getInternerGeschaeftsgang().addAll((Collection<? extends GeschaeftsgangType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS:
				getVerweis().clear();
				getVerweis().addAll((Collection<? extends VerweisType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE:
				getAnlage().clear();
				getAnlage().addAll((Collection<? extends AnlageDokumentType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR:
				getAutor().clear();
				getAutor().addAll((Collection<? extends KontaktType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER:
				getLeser().clear();
				getLeser().addAll((Collection<? extends KontaktType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT:
				getWeitererKontakt().clear();
				getWeitererKontakt().addAll((Collection<? extends KontaktType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				getAnwendungsspezifischeErweiterung().addAll((Collection<? extends AnwendungsspezifischeErweiterungType>)newValue);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)newValue);
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
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION:
				setIdentifikation((IdentifikationObjektType)null);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN:
				setAllgemeineMetadaten((AllgemeineMetadatenType)null);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN:
				setFremdesGeschaeftszeichen(FREMDES_GESCHAEFTSZEICHEN_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM:
				setPosteingangsdatum(POSTEINGANGSDATUM_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM:
				setPostausgangsdatum(POSTAUSGANGSDATUM_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS:
				setDatumDesSchreibens(DATUM_DES_SCHREIBENS_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG:
				setBezug(BEZUG_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER:
				setHier(HIER_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER:
				setBearbeiter(BEARBEITER_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				getHistorienProtokollInformation().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG:
				getInternerGeschaeftsgang().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS:
				getVerweis().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE:
				getAnlage().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR:
				getAutor().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER:
				getLeser().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT:
				getWeitererKontakt().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				return;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)null);
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
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION:
				return identifikation != null;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN:
				return allgemeineMetadaten != null;
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN:
				return FREMDES_GESCHAEFTSZEICHEN_EDEFAULT == null ? fremdesGeschaeftszeichen != null : !FREMDES_GESCHAEFTSZEICHEN_EDEFAULT.equals(fremdesGeschaeftszeichen);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM:
				return POSTEINGANGSDATUM_EDEFAULT == null ? posteingangsdatum != null : !POSTEINGANGSDATUM_EDEFAULT.equals(posteingangsdatum);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM:
				return POSTAUSGANGSDATUM_EDEFAULT == null ? postausgangsdatum != null : !POSTAUSGANGSDATUM_EDEFAULT.equals(postausgangsdatum);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS:
				return DATUM_DES_SCHREIBENS_EDEFAULT == null ? datumDesSchreibens != null : !DATUM_DES_SCHREIBENS_EDEFAULT.equals(datumDesSchreibens);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG:
				return BEZUG_EDEFAULT == null ? bezug != null : !BEZUG_EDEFAULT.equals(bezug);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER:
				return HIER_EDEFAULT == null ? hier != null : !HIER_EDEFAULT.equals(hier);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER:
				return BEARBEITER_EDEFAULT == null ? bearbeiter != null : !BEARBEITER_EDEFAULT.equals(bearbeiter);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION:
				return historienProtokollInformation != null && !historienProtokollInformation.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG:
				return internerGeschaeftsgang != null && !internerGeschaeftsgang.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS:
				return verweis != null && !verweis.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE:
				return anlage != null && !anlage.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR:
				return autor != null && !autor.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER:
				return leser != null && !leser.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT:
				return weitererKontakt != null && !weitererKontakt.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return anwendungsspezifischeErweiterung != null && !anwendungsspezifischeErweiterung.isEmpty();
			case DomeaPackage.DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return anwendungsspezifischeErweiterungXML != null;
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
		result.append(" (fremdesGeschaeftszeichen: ");
		result.append(fremdesGeschaeftszeichen);
		result.append(", posteingangsdatum: ");
		result.append(posteingangsdatum);
		result.append(", postausgangsdatum: ");
		result.append(postausgangsdatum);
		result.append(", datumDesSchreibens: ");
		result.append(datumDesSchreibens);
		result.append(", bezug: ");
		result.append(bezug);
		result.append(", hier: ");
		result.append(hier);
		result.append(", bearbeiter: ");
		result.append(bearbeiter);
		result.append(", typ: ");
		result.append(typ);
		result.append(')');
		return result.toString();
	}

} //DokumentSchriftstueckBasisTypeImpl
