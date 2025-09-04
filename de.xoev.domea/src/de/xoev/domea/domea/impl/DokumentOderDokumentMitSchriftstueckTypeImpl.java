/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DokumentMitSchriftstueckType;
import de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType;
import de.xoev.domea.domea.DokumentType;
import de.xoev.domea.domea.DomeaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dokument Oder Dokument Mit Schriftstueck Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl#getDokument <em>Dokument</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl#getDokumentMitSchriftstueck <em>Dokument Mit Schriftstueck</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DokumentOderDokumentMitSchriftstueckTypeImpl extends MinimalEObjectImpl.Container implements DokumentOderDokumentMitSchriftstueckType {
	/**
	 * The cached value of the '{@link #getDokument() <em>Dokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokument()
	 * @generated
	 * @ordered
	 */
	protected DokumentType dokument;

	/**
	 * The cached value of the '{@link #getDokumentMitSchriftstueck() <em>Dokument Mit Schriftstueck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDokumentMitSchriftstueck()
	 * @generated
	 * @ordered
	 */
	protected DokumentMitSchriftstueckType dokumentMitSchriftstueck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DokumentOderDokumentMitSchriftstueckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentType getDokument() {
		return dokument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDokument(DokumentType newDokument, NotificationChain msgs) {
		DokumentType oldDokument = dokument;
		dokument = newDokument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT, oldDokument, newDokument);
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
	public void setDokument(DokumentType newDokument) {
		if (newDokument != dokument) {
			NotificationChain msgs = null;
			if (dokument != null)
				msgs = ((InternalEObject)dokument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT, null, msgs);
			if (newDokument != null)
				msgs = ((InternalEObject)newDokument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT, null, msgs);
			msgs = basicSetDokument(newDokument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT, newDokument, newDokument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DokumentMitSchriftstueckType getDokumentMitSchriftstueck() {
		return dokumentMitSchriftstueck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDokumentMitSchriftstueck(DokumentMitSchriftstueckType newDokumentMitSchriftstueck, NotificationChain msgs) {
		DokumentMitSchriftstueckType oldDokumentMitSchriftstueck = dokumentMitSchriftstueck;
		dokumentMitSchriftstueck = newDokumentMitSchriftstueck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK, oldDokumentMitSchriftstueck, newDokumentMitSchriftstueck);
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
	public void setDokumentMitSchriftstueck(DokumentMitSchriftstueckType newDokumentMitSchriftstueck) {
		if (newDokumentMitSchriftstueck != dokumentMitSchriftstueck) {
			NotificationChain msgs = null;
			if (dokumentMitSchriftstueck != null)
				msgs = ((InternalEObject)dokumentMitSchriftstueck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK, null, msgs);
			if (newDokumentMitSchriftstueck != null)
				msgs = ((InternalEObject)newDokumentMitSchriftstueck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK, null, msgs);
			msgs = basicSetDokumentMitSchriftstueck(newDokumentMitSchriftstueck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK, newDokumentMitSchriftstueck, newDokumentMitSchriftstueck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT:
				return basicSetDokument(null, msgs);
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK:
				return basicSetDokumentMitSchriftstueck(null, msgs);
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
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT:
				return getDokument();
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK:
				return getDokumentMitSchriftstueck();
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
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT:
				setDokument((DokumentType)newValue);
				return;
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK:
				setDokumentMitSchriftstueck((DokumentMitSchriftstueckType)newValue);
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
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT:
				setDokument((DokumentType)null);
				return;
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK:
				setDokumentMitSchriftstueck((DokumentMitSchriftstueckType)null);
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
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT:
				return dokument != null;
			case DomeaPackage.DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK:
				return dokumentMitSchriftstueck != null;
		}
		return super.eIsSet(featureID);
	}

} //DokumentOderDokumentMitSchriftstueckTypeImpl
