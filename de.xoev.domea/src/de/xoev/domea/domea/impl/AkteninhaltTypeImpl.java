/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AkteType;
import de.xoev.domea.domea.AkteninhaltType;
import de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.VorgangType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Akteninhalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AkteninhaltTypeImpl#getDokumentOderDokumentMitSchriftstueck <em>Dokument Oder Dokument Mit Schriftstueck</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteninhaltTypeImpl#getVorgang <em>Vorgang</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AkteninhaltTypeImpl#getTeilakte <em>Teilakte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AkteninhaltTypeImpl extends MinimalEObjectImpl.Container implements AkteninhaltType {
	/**
	 * The cached value of the '{@link #getDokumentOderDokumentMitSchriftstueck() <em>Dokument Oder Dokument Mit Schriftstueck</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumentOderDokumentMitSchriftstueck()
	 * @generated
	 * @ordered
	 */
	protected EList<DokumentOderDokumentMitSchriftstueckType> dokumentOderDokumentMitSchriftstueck;

	/**
	 * The cached value of the '{@link #getVorgang() <em>Vorgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorgang()
	 * @generated
	 * @ordered
	 */
	protected EList<VorgangType> vorgang;

	/**
	 * The cached value of the '{@link #getTeilakte() <em>Teilakte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilakte()
	 * @generated
	 * @ordered
	 */
	protected EList<AkteType> teilakte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AkteninhaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AKTENINHALT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DokumentOderDokumentMitSchriftstueckType> getDokumentOderDokumentMitSchriftstueck() {
		if (dokumentOderDokumentMitSchriftstueck == null) {
			dokumentOderDokumentMitSchriftstueck = new EObjectContainmentEList<DokumentOderDokumentMitSchriftstueckType>(DokumentOderDokumentMitSchriftstueckType.class, this, DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK);
		}
		return dokumentOderDokumentMitSchriftstueck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VorgangType> getVorgang() {
		if (vorgang == null) {
			vorgang = new EObjectContainmentEList<VorgangType>(VorgangType.class, this, DomeaPackage.AKTENINHALT_TYPE__VORGANG);
		}
		return vorgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AkteType> getTeilakte() {
		if (teilakte == null) {
			teilakte = new EObjectContainmentEList<AkteType>(AkteType.class, this, DomeaPackage.AKTENINHALT_TYPE__TEILAKTE);
		}
		return teilakte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK:
				return ((InternalEList<?>)getDokumentOderDokumentMitSchriftstueck()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTENINHALT_TYPE__VORGANG:
				return ((InternalEList<?>)getVorgang()).basicRemove(otherEnd, msgs);
			case DomeaPackage.AKTENINHALT_TYPE__TEILAKTE:
				return ((InternalEList<?>)getTeilakte()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK:
				return getDokumentOderDokumentMitSchriftstueck();
			case DomeaPackage.AKTENINHALT_TYPE__VORGANG:
				return getVorgang();
			case DomeaPackage.AKTENINHALT_TYPE__TEILAKTE:
				return getTeilakte();
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
			case DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK:
				getDokumentOderDokumentMitSchriftstueck().clear();
				getDokumentOderDokumentMitSchriftstueck().addAll((Collection<? extends DokumentOderDokumentMitSchriftstueckType>)newValue);
				return;
			case DomeaPackage.AKTENINHALT_TYPE__VORGANG:
				getVorgang().clear();
				getVorgang().addAll((Collection<? extends VorgangType>)newValue);
				return;
			case DomeaPackage.AKTENINHALT_TYPE__TEILAKTE:
				getTeilakte().clear();
				getTeilakte().addAll((Collection<? extends AkteType>)newValue);
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
			case DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK:
				getDokumentOderDokumentMitSchriftstueck().clear();
				return;
			case DomeaPackage.AKTENINHALT_TYPE__VORGANG:
				getVorgang().clear();
				return;
			case DomeaPackage.AKTENINHALT_TYPE__TEILAKTE:
				getTeilakte().clear();
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
			case DomeaPackage.AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK:
				return dokumentOderDokumentMitSchriftstueck != null && !dokumentOderDokumentMitSchriftstueck.isEmpty();
			case DomeaPackage.AKTENINHALT_TYPE__VORGANG:
				return vorgang != null && !vorgang.isEmpty();
			case DomeaPackage.AKTENINHALT_TYPE__TEILAKTE:
				return teilakte != null && !teilakte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AkteninhaltTypeImpl
