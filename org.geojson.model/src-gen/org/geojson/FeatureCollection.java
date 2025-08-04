/*
 */
package org.geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.FeatureCollection#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.geojson.GeoJsonPackage#getFeatureCollection()
 * @model
 * @generated
 */
@ProviderType
public interface FeatureCollection extends GeoJsonObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.geojson.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.geojson.GeoJsonPackage#getFeatureCollection_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureCollection
